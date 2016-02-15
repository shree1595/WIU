# Demo 1: read and print data
.data
      prompt: .asciiz "Please input the integer value of size:"
      printmsg: .asciiz "The value of size is: "
      size: .word  0             # size to be initialized
.text
      la   $s5, size    # load address of size variable
      la   $a0, prompt  # load address of prompt for syscall
      li   $v0, 4       # specify Print String service
      syscall           # print the prompt string
      li   $v0, 5       # specify Read Integer service
      syscall           # Read the number. After this instruction, the number read is in $v0.
      sw $v0, 0($s5)    # store the input value to variable size
      
      la $a0, printmsg  # load address of printmsg for syscall
      li $v0, 4         # specify Print String service
      syscall
            
      li $v0, 1		# specify Print integer service	
      lw $a0, 0($s5)    # load the value of size
      syscall   
      
      li   $v0, 10      # Terminate execution
      syscall
