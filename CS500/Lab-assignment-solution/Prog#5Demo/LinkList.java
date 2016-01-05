/*
 *   Sample code for LinkList Class
 */

import java.util.Stack;

public class LinkList {
		
		IntegerNode head;         // head of the list		 
		 
		 public void insert(int pos, IntegerNode item)    //add one node there
		 {
			 IntegerNode dummy = new IntegerNode(-1, null); // dummy node to assist the programming
			 dummy.next = head;
			 
			 IntegerNode curr = dummy;
			 
			 while(--pos >= 0)                            // find the position, curr.next will be right position to add new node there
			 {
				 curr = curr.next;				 
			 }
			 
			 item.next = curr.next;                     //insert the node in the list
			 curr.next = item;
			 
			 head = dummy.next;                          // update head
		 }
		 
		 public IntegerNode get(int pos)				// return the node at position at pos
		 {
			 IntegerNode curr = head; 
			 
			 while(pos -- > 0)
			 {
				 curr = curr.next;
			 }
			 return curr;			 
		 }
		 
		 public void remove(int value)					// remove the node with item as value
		 {
			 IntegerNode dummy = new IntegerNode(-1, null);
			 dummy.next = head;
			 
			 IntegerNode curr = dummy;
			 
			 while(curr != null && curr.next!= null)
			 {
				 if(curr.next.item == value)
				 {
					 curr.next = curr.next.next;
				 }
				 curr = curr.next;
			 }
			 
			 head = dummy.next;
			 
		 }		 
		 
		 public String toString()   					//return the string representation of the list
		 {
			StringBuilder ret = new StringBuilder();
			IntegerNode curr = head;
			
			 while (curr != null)
			 {
				 if(curr != head)
				 {
					 ret.append("->"); 
				 }
				 ret.append(curr.item);
				 curr = curr.next;
			 }			
			return ret.toString();			
		 }	
		 
		 public boolean checkPalindrome()        // check if the LinkList a palindrome or not
		 {
			 Stack<IntegerNode> stk = new Stack<IntegerNode>();
			 IntegerNode temp = head;
			 while(temp != null)
			 {
				 stk.push(temp);
				 temp = temp.next;
			 }
			 
			 temp = head;
			 
			 while(!stk.empty())
			 {
				 if(stk.pop().item != temp.item)
					 return false;
				 temp = temp.next;
			 }
			 return true;			 
		 }
		
		 public static void main(String[] args)  // test program
		 {
		 
			 LinkList list = new LinkList();
			 list.insert(0,new IntegerNode(10));
			 list.insert(0,new IntegerNode(20));
			 list.insert(0,new IntegerNode(40));
			 System.out.println(list);
			 System.out.println(list. checkPalindrome());
			 list.insert(1,new IntegerNode(30));
			 System.out.println(list);
			 System.out.println(list. checkPalindrome());
		 }
	}

class IntegerNode{
	protected int item;
	protected IntegerNode next;
	IntegerNode (int itemArg ) {
	item = itemArg;
	next = null;
	}
	IntegerNode( int itemArg, IntegerNode nextArg ) {
	item = itemArg;
	next = nextArg;
	}
	
	public String toString()
	{
		return item+"";
	}	
}