/*
 * 
 * 	   Sample code for implementing Queue using Stacks
 *
 */
import java.util.Stack;

public class QueueStack {

	    Stack<Integer> backup = new Stack<Integer>();
	    Stack<Integer> primary = new Stack<Integer>();
	 
	    // Push element x to the back of queue.
	    public void push(int x) {
	        if(primary.isEmpty()){
	        	primary.push(x);
	        }
	        else{
	            while(!primary.isEmpty()){
	            	primary.push(primary.pop());
	            }
	 
	            primary.push(x);
	 
	            while(!backup.isEmpty()){
	            	primary.push(backup.pop());
	            }    
	        }
	    }
	 
	    
	    public void pop() {   			// Removes the element from in front of queue.
	    	primary.pop();
	    }
	 
	    
	    public int peek() {   			// Get the front element
	        return primary.peek();
	    }
	 
	    
	    public boolean empty() {    	// Return whether the queue is empty.        
	        return primary.isEmpty();
	    }
}
