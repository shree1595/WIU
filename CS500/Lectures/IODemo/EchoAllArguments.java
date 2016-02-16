/*
 *  Sample code to print all the command line arguments.
 *  To run this example, 
 *  1)  launch command line window,  
 *  2) javac EchoAllArguments.java 
 *  3) java EchoAllArguments args0 args1 args2 ...
 *  
 */
public class EchoAllArguments {
	
	public static void main(String[] args) {
		
		if (args.length == 0) // check if empty input
		{
			System.out.println("No input argument!");			
		}
		else
		{
			for (int i = 0; i < args.length; i++) // print all the arguments
			{
				System.out.println(args[i]);
			}			
		}
	}

}
