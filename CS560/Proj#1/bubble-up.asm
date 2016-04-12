# CS560 Project 1
# bubble up largest element in array
.data
	size:	.word 9 
	array:	.word 10,2,101,100,5,16,7,8,10001
	before: .asciiz "Array before bubble up : \n"
	space: 	.asciiz " "
	after:	.asciiz "Array after bubble up : \n"
	nline:	.asciiz "\n"

.text
	la $s0, array		# Load array address
	la $s1, size		# Load address of size variable
	lw $s1, 0($s1)      # Load value of size

	la $a0, before		# Print out prompt before bubble up
	li $v0, 4
	syscall
		
	jal ptarr             # Print the array
	
################################### find the largest element within the array ##############################		
	addi $t0, $s0, 0        # Save base array address
	addi $t1, $s1, -1	# Calculate address of last element of array
	sll $t1, $t1, 2		
	add $t1, $t1, $t0
	lw $t6, 0($t0)      # t6 indicates the largest value within the array, initialized to the first one
	add $t5, $t0, $0      #t5 indicates the address of largest value
	
start: slt $t2, $t1, $t0	# Loop to find the largest one
	bne $t2, $0,  buble_up	# If the ends overlap or pass each other, exit the loop	
	lw $t4, 0($t0)
	slt $t3, $t6, $t4       # if current one is larger that $t6, update $t6
	beq $t3, $0, add_index
	add $t6, $t4, $0
	add $t5, $t0, $0	    # update $t5 as the address of the largest element
	
add_index:  addi $t0, $t0, 4
	j start	
	
################################### bubble up the largest element to the end of the array ###################
buble_up:  slt $t2, $t5, $t1	# Loop to reverse array contents
	beq $t2, $0,  rdone	# If the ends overlap or pass each other, exit the loop
	
	lw $t3, 4($t5)		# Get the two values to be swapped
	sw $t3, 0($t5)
inc_index: addi $t5, $t5, 4	# Increment 1st value address
#	addi $t1, $t1, -4	# Decrement end value address
	j buble_up
	
rdone:	sw $t6, 0($t5)
     	la $a0, after		#  Print out prompt after array bubble up
		li $v0, 4
		syscall
#####################################################################################

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
	
	
