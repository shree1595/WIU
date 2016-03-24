/*
 *   Sample code for linklist class, need to add more methods....
 */

public class LinkList {
		
		 Node head;         // head of the list		 
		 
		 public void addNode(int value)    //add one node there
		 {
			 Node nn =new Node(value, null);
			 
			 if(head == null)
			 {
				 head = nn;
				 return;
			 }
		    nn.next = head.next;   //insert at the beginning
		    head.next = nn;			
		 }
		 
		 public void printList()   //print the list from the head
		 {
			 Node start = head;
			 
			 while (start != null)
			 {
				 System.out.println(start.data);
				 start = start.next;
			 }
		 }
		 
		 public void reverse()       //reverse the whole list: 1->3->5 will be 5->3->1
		 {
			 Node dummy = new Node(-1, null);   // add a dummy node to assist the reversal
			 
			 while(head != null)   
			 {
				 Node next = head.next;
				 head.next = dummy.next;
				 dummy.next = head;
				 head = next;
			 }
			 
			 head = dummy.next;
		 }
		 
		 
		 public static void main(String[] args)
		 {
			 LinkList list = new LinkList();   // create a new list
			 list.addNode(10);					//add three nodes
			 list.addNode(110);			        
			 list.addNode(209);			 
			 list.printList();					//print the list
			 list.reverse();					//reverse the list
			 list.printList();					// print the list again
		 }
	}