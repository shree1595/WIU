# CS560 Project 1
# Sample source for second largest element

.data
	prompt: .asciiz "\n Please type in integer values one by one, totally should be 8: \n"	
	array:	.word 0:9 
	size:	.word 10
	space:	.asciiz " "
	nline:	.asciiz "\n"
	result:	.asciiz "\nThe entered array is: "
	maxp:	.asciiz "\nThe largest value is: "
	secp:	.asciiz "\nThe second largest value is: "
	sec:    .word, 0x80000000	# For minimum; use the largest integer value
	max:    .word, 0x80000000	# For maximum; use the smallest integer value
.text
	la $s0, array		# Load array address	
	la $s1, size            # Load address of size variable 
	lw $s1, 0($s1)	        # Load value of size	

	jal input              # Call user input
	jal ptarr              # Print the input array
	jal getMM              # Calculate Second Max/MAX
	jal mmPrint            # Print max and second max
	j exit                 # Terminate the program

#################### Input function: get the input from user ##########################################		
input:	addi $sp, $sp, -8	# Create space to store  $s0 and $s1 on the stack
	sw $s0, 4($sp)          # save $s0  to stack
	sw $s1, 0($sp)          # save s1 to stack

	la $a0, prompt		# Display prompt	
	li $v0, 4
	syscall
	
instart: slti $t2, $s1, 1	# Loop to get input of the integers
	bne  $t2, $0, inpend
		
	li $v0, 5		# Get integer from user input
	syscall
	
	sw $v0, 0($s0)		# Store user input in array
	
	addi $s0, $s0, 4	# Increment array and decrement size
	addi $s1, $s1, -1
	j instart
	
inpend:	lw $s0, 4($sp)		# Restore $s0
        lw $s1, 0($sp)          # Restore $s1
	addi $sp, $sp, 8        # Restore stack pointer
	jr $ra			# Return to main program
###################################################################################################	
	
	
#################### Sec max/Max Display function: ####################################################		
mmPrint:la $a0, secp		# Display second max
	li $v0, 4
	syscall
	
	la $t0, sec       
	lw $a0, 0($t0)
	li $v0, 1
	syscall
	
	la $a0, maxp		# Display max 
	li $v0, 4
	syscall
	
	la $t0, max       
	lw $a0, 0($t0)
	li $v0, 1
	syscall
	
	jr $ra
####################################################################################################

#################################  Print Array Function ##########################################
ptarr:  addi $sp, $sp, -8	# Create space to store  $s0 and $s1 on the stack
	sw $s0, 4($sp)          # save $s0  to stack
	sw $s1, 0($sp)          # save s1 to stack
	
	la $a0, result		# Print a space character
	li $v0, 4
	syscall	
				
prtloop:	slti $t1, $s1, 1	# print loop; $a1 is the size of the array passed to the function
	bne  $t1, $0, prtdone	# when we reach end of array, stop loop
	
	lw $a0, 0($s0)		# Print array value
	li $v0, 1
	syscall
	
	la $a0, space		# Print a space character
	li $v0, 4
	syscall
	
	addi $s0, $s0, 4	# Go to next item in array
	addi $s1, $s1, -1	# Decrement size
	j prtloop

prtdone:	la $a0, nline		# Print a new line
	li $v0, 4
	syscall
	
    lw $s0, 4($sp)		# Restore $s0
    lw $s1, 0($sp)          # Restore $s1
	addi $sp, $sp, 8        # Restore stack pointer
	jr $ra			# Return to main program
#############################################################################


############################  Get Sec Max/MAX Function ##########################
getMM:	addi $sp, $sp, -8	# Save the base array address for later on the stack	
	sw $s0, 0($sp)		
	sw $s1, 4($sp)		# Save the size as well 

	la $t5, max       
	lw $t0, 0($t5)
	
	la $t6, sec
	lw $t1, 0($t6)
	
mmLoop:	slti $t3, $s1, 1
	bne $t3, $0, mmDone	
	
	lw $t2, 0($s0)
							
	slt $t3, $t0, $t2	# If current value is larger than the current largest one
	beq $t3, $0, skpMin		# jump to second max 
	add $t1, $t0, $0
	add $t0, $t2, $0	# Save current value as the max
	j next
	
skpMin:	slt $t3, $t1, $t2	# elseif current value is greater than max
	beq $t3, $0, next		# jump to next
	add $t1, $t2, $0
	j next			# otherwise go to end of loop
	
next:	addi $s0, $s0, 4	# Go to next item in array
	addi $s1, $s1, -1	# Decrement size
	j mmLoop
	
mmDone: sw $t0, 0($t5)
	sw $t1, 0($t6)
	lw $s0, 4($sp)		# Restore $s0
    lw $s1, 0($sp)          # Restore $s1
	addi $sp, $sp, 8        # Restore stack pointer
	jr $ra			# Return to main program
#############################################################################
exit: 	li $v0, 10		# Exit program cleanly
	syscall