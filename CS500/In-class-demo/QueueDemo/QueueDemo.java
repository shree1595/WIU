/*
 *  Simple example for Queue API
 */

import java.util.*;

public class QueueDemo {
	
	public static void main(String[] args)
	{	
		Queue<String> qe = new LinkedList<String>();   // create an empty queue
		qe.offer("Hello");							   // insert three strings at the end
		qe.offer("Word");
		qe.offer("CS500");
		
		qe.peek();									  // read the head but not remove
		qe.poll();									  // remove the head
		
		while(!qe.isEmpty()){                         // print out the queue from the head
			System.out.println(qe.poll());
		}	
	}	 
}
