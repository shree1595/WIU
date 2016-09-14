.data
arr1:  .word   0:3         # "array" of words to contain fib values
size: .word  4                       # size of "array" (agrees with array declaration)
space: .asciiz " "
headprint: .asciiz   "Please enter the numbers: "
headenter: .asciiz 		"The values in arr1 are printed out in order as: "
.text
      la   $s0, arr1        # load address of array
      la   $s5, size        # load address of size variable
      lw   $s5, 0($s5)      # load array size
      
      la $a0, headprint    #print the enter msg
      li $v0, 4
      syscall
 
      add $a0, $s0, $0    
      add $a1, $s5, $0        

 # lines 21 - 29 are to read user's input
input: slti $t0, $a1, 1    
       bne $t0, $zero, exitinput
       li $v0, 5
       syscall
       sw  $v0, ($a0)
       addi $a0, $a0, 4
       addi $a1, $a1, -1
       j input        
             
#  lines 31 - 48 are to print the array                       
exitinput: la   $a0, headenter # print the head string
      li   $v0, 4              # specify Print string service
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
