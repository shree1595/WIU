# CS560 Project 1
# Reverse array
.data
	size:	.word 8 
	array:	.word 1,2,3,4,5,6,7,8
	before: .asciiz "Array before reversal : \n"
	space: 	.asciiz " "
	after:	.asciiz "Array after reversal : \n"
	nline:	.asciiz "\n"

.text
	la $s0, array		# Load array address
	la $s1, size		# Load address of size variable
	lw $s1, 0($s1)          # Load value of size

	la $a0, before		# Print out prompt before array reversal
	li $v0, 4
	syscall
	
	jal ptarr             # Print the array
	
#################################################### Reverse the array ##############################	
	add $t0, $s0, $0        # Save base array address
	addi $t1, $s1, -1	# Calculate address of last element of array
	sll $t1, $t1, 2		
	add $t1, $t1, $t0
	
rev:	slt $t2, $t1, $t0	# Loop to reverse array contents
	beq $t2, $0,  rdone	# If the ends overlap or pass each other, exit the loop
	
	lw $t3, 0($t0)		# Get the two values to be swapped
	lw $t4, 0($t1)
	sw $t4, 0($t0)		# swap them
	sw $t3, 0($t1)
	
	addi $t0, $t0, 4	# Increment 1st value address
	addi $t1, $t1, -4	# Decrement end value address
	j rev
	
rdone:	la $a0, after		#  Print out prompt after array reversal
	li $v0, 4
	syscall
########################################################################################

	jal ptarr	# Print the array
	j exit	
	
################## Print Function ####################################################
ptarr:  addi $sp, $sp, -8	# Create space to store  $s0 and $s1 on the stack
	sw $s0, 4($sp)          # save $s0  to stack
	sw $s1, 0($sp)          # save s1 to stack
		
ploop:	slti $t1, $s1, 1	# print loop; $a1 is the size of the array passed to the function
	bne  $t1, $0, pdone	# when we reach end of array, stop loop
	
	lw $a0, 0($s0)		# Print array value
	li $v0, 1
	syscall
	
	la $a0, space		# Print a space character
	li $v0, 4
	syscall
	
	addi $s0, $s0, 4	# Go to next item in array
	addi $s1, $s1, -1	# Decrement size
	j ploop

pdone:	la $a0, nline		# Print a new line
	li $v0, 4
	syscall
	
        lw $s0, 4($sp)		# Restore $s0
        lw $s1, 0($sp)          # Restore $s1
	addi $sp, $sp, 8        # Restore stack pointer
	jr $ra			# Return to main program
#####################################################################
# Exit the program
exit:   li   $v0, 10          # System call to exit
        syscall               # Exit
	
	
