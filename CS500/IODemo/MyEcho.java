/*
 *  Sample code for command line example MyEcho.
 *  To run this example, 1)  launch command line window,  2) javac MyEcho.java 3) java MyEcho args0 args1 
 *  
 */


public class MyEcho {
   public static void main( String[] args ) {
	    if (args.length == 2) {
	      System.out.println("args[0] is" + args[0]);
	      System.out.println("args[1] is " + args[1]);
	    } else {
	      System.out.println( "Usage:  java MyEcho" 
                               + "string1 string2");
      } // end if
    } // end main
} // end MyEcho
