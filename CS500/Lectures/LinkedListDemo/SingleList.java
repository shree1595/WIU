/*
 * 
 *  Source code for SingleList Demo
 *  Here only provide addNode, printList methods, 
 *  more methods, such as remove, find need to figure them out.
 */
public class SingleList {

	Node head;   // head of the list
	Node end;    // end of the list
	
	public SingleList()
	{
		head = new Node(-1, null);  // create a dummy node
		end = head;
	}
	
	public void addNode(int value)
	{
		Node newNode = new Node(value, null);   // create a new node
		end.next = newNode;                     // append to the end
		end = end.next;							// update end
	}
		
	public void printList(Node start)           // print the whole list from beginning
	{
		while(start != null)
		{
			System.out.println(start.data);
			start = start.next;
		}
	}
	
	public static void main(String[] args)
	{
		SingleList list = new SingleList();  // create a empty
			
		list.addNode(10);					 // add three nodes here
		
		list.addNode(100);
		
		list.addNode(25);
		
		list.printList(list.head.next);		// print three new added node
		
	}
	
}
