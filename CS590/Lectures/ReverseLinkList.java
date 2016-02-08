/*
 *  Course: CS590
 *  ReverseLinkList.java - sample code to reverse a linked list
 *  Author: Zheng Li
 */

public class ReverseLinkList {

	public static void main(String[] args) {   //test program
	
		node head = new node(1);
		node previous = head;
		
		for (int i = 2; i < 5; i ++)    //create a linked list
		{
			previous.next = new node(i);
			previous = previous.next;			
		}
		
		head = reverseList(head);		
		printLinkedList(head);
	}
	
	public static node reverseList(node head)   // reserve the given linkedlist
	{
		node dummy  = new node(-1);		     //create a dummy node
		node curr = head;
		
		while(curr != null)
		{
			node next = curr.next;
			curr.next = dummy.next;
			dummy.next = curr;	
			curr = next;
		}
		return dummy.next;		
	}
	
	public static void printLinkedList(node head)   // print the linkedlist
	{
		node curr = head;
		
		while(curr != null)
		{
			System.out.println(curr.data);
			curr = curr.next;
		}		
	}	
}


class node{   // define the node class
	
	int data;
	node next;
	
	node(int value)
	{
		data = value;
		next = null;
	}	
}
