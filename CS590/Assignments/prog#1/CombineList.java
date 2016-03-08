/*
 *  Sample code for combine list  
 *  Course: CS 590
 */
public class CombineList {
	
	public static void main(String[] args) // test program
	{
		ListNode head1 = new ListNode(-1);
		ListNode head2 = new ListNode(-1);
		ListNode curr = head1;
		
		for (int i = 10; i > 1; i --)               // generate the first list
		{
			curr = new ListNode(i);			
			curr.next = head1.next;
			head1.next = curr;			
		}
		
		for (int i = 10; i > 1; i --)               // generate the second list
		{
			curr = new ListNode(i*2 + 1);			
			curr.next = head2.next;
			head2.next = curr;			
		}	
		
	   ListNode merged_head = mergeTwoLists(head1.next, head2.next);
	   
	    printList(merged_head);
		
	}
	
	/*
	 *  Merge two sorted arrays: using two indexes for comparsion
	 */
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode dummy = new ListNode(Integer.MIN_VALUE);
	        ListNode pre = dummy;
	        
	        while(l1 != null && l2 != null)
	        {
	            if (l1.val < l2.val)
	            {
	                pre.next = l1;
	                l1 = l1.next;
	            }
	            else
	            {
	                pre.next = l2;
	                l2 = l2.next;
	            }
	            pre = pre.next;
	        }
	        
	        ListNode cur = l1 == null ? l2:l1;
	        
	        while(cur != null)
	        {
	            pre.next = cur;
	            cur = cur.next;
	            pre = pre.next;
	        }
	        
	        return dummy.next;
	    }
	
	public static void printList(ListNode head)  // function to print all the nodes
	{
		while(head !=  null)
		{
			System.out.println(head.val);
			head = head.next;
		}
	}
}