# Demo 2: Initialize and print array
.data
arr1:  .word   1, 2, 3, 4, 5         # "array" of words to contain fib values
size: .word  5                       # size of "array" (agrees with array declaration)
space: .asciiz " "
head: .asciiz 		"The values in arr1 are printed out in order as: "
.text
      la   $s0, arr1        # load address of array
      la   $s5, size        # load address of size variable
      lw   $s5, 0($s5)      # load array size
      
      la   $a0, head	    # print the head string
      li   $v0, 4           # specify Print string service
      syscall
loop: slti $t1, $s5, 1      # check if reach the bound 
      bne $t1, $zero, exit   
      lw  $a0, ($s0)        # load the value at $s0
      li $v0, 1             # specify Print integer service 
      syscall  
      
      la   $a0, space      # load  the  space  
      li   $v0, 4 	   # specify Print string service
      syscall
        
      addi $s0, $s0, 4    # next word     
      addi $s5, $s5, -1   # decrease size
       
      j loop              # jump to loop
      # The program is finished. Exit.
exit: li   $v0, 10          # system call for exit
      syscall               # Exit!
