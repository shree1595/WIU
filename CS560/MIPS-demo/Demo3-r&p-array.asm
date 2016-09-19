.data 
   	printmsg: .asciiz "please enter a number:\n"
   	prompt: .asciiz " "  
   	arr: .word 0:4   # array arr
   	size: .word 5
.text  
  	la $s0, arr       # load address of arr to s0
  	la $s1, size      # load address of size to s1
  	lw $s2, 0($s1)    # load value of size to s2
  
  	add $a1, $s0, $0  # copy $s0 to a1
  	add $a2, $s2, $0  # copy s2 to a2
  	jal readinput     # call readinput function
  
  	add $a1, $s0, $0  # copy $s0 to a1
  	add $a2, $s2, $0  # copy s2 to a2
  	jal printinput    # call readinput function
  
  	li $v0, 10        # terminate the program
  	syscall

# function to read number from console  	
readinput: 	slti $t0, $a2, 1  # if (a2 < 1) go end
           	bne $t0, $0, end  
           	
  	la $a0, printmsg  # print the message
  	li $v0, 4
  	syscall
  
  	li $v0, 5         # read one number from console
  	syscall
  
  	sw $v0, 0($a1)    # store into arr[i]
  	addi $a1, $a1, 4  # increase address of arr by 4
  	addi $a2, $a2, -1 # decrease a2 by 1   
  	j readinput       # go readinput
end: 	jr $ra            # goto origin point

# function to print number on the console   
printinput: 	slti $t0, $a2, 1  # if $a2 < 1, goto exit
           	bne $t0, $0, exit  
           	
           	lw $a0, 0($a1)    # print arr[i]
           	li $v0, 1
           	syscall
           	
            	la $a0, prompt    # print a prompt
            	li $v0, 4
            	syscall
           
           	addi $a1, $a1, 4  # increase address of arr by 4
           	addi $a2, $a2, -1 # decrease a2 by 1
           	  
           	j printinput      # go loop
exit: 	jr $ra            # jump to origin