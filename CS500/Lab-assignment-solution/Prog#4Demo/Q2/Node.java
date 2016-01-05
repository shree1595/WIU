/*
 *    Source code for generic class Node
 */
public class Node<T> {
	
	protected T item;
	
	protected Node<T> next;
	
	Node( T itemArg ) {   //// constructor with one parameter
		item = itemArg;
		next = null;
	}
	
	Node( T itemArg, Node<T> nextArg ) {   // constructor with two parameters
		item = itemArg;
		next = nextArg;
	}
	
	public static void main( String [] args ) {
		
		System.out.println("Test program for String type:");
		Node<String> firstNode = new Node<String>(new String("last"));
		
		firstNode = new Node<String>(new String("middle"),firstNode);
		firstNode = new Node<String>(new String("first"),firstNode);
		
		for (Node<String> current = firstNode; current != null; current = current.next) {
			
			System.out.println((String)current.item + ' ');
		}
		
		System.out.println("Test program for Integer type:");
		Node<Integer> IntNode = new Node<Integer>(new Integer(10));
		
		IntNode = new Node<Integer>(new Integer(20),IntNode);
		IntNode = new Node<Integer>(new Integer(30),IntNode);
		
		for (Node<Integer> current = IntNode; current != null; current = current.next) {			
			System.out.println(current.item);
		}		
	}
}