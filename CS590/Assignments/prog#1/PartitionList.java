/*
 *  Sample code for partition list  
 *  Course: CS 590
 */
public class PartitionList {

	public static void main(String[] args)   // test program
	{
		int n = 10;		
		
		ListNode head = new ListNode(-1);
		ListNode curr = head;
		
		for (int i = 1; i < 10; i ++)               // generate a list for testing
		{
			int num = (int) (Math.random() * 10);
			curr = new ListNode(num);			
			curr.next = head.next;
			head.next = curr;			
		}
		
		System.out.println("Before partition:");
		printList(head);
		
		System.out.println("After partition:");
		partition(head, 5);
		printList(head);
		
		
	}
	
	public static ListNode partition(ListNode head, int x) {
	        ListNode head1 = new ListNode(Integer.MIN_VALUE);   // head1: header of list 1 < x
	        ListNode proc1 = head1;                             
	        ListNode head2 = new ListNode(Integer.MAX_VALUE);   // head2: header of list 2 >= x
	        ListNode proc2 = head2;
	        
	        ListNode cur = head;
	        while (cur != null)
	        {
	            if (cur.val < x)
	            {
	                proc1.next = cur;
	                proc1 = proc1.next;
	            }
	            else
	            {
	                proc2.next = cur;
	                proc2 = proc2.next;
	            }
	            cur = cur.next;
	        }
	        
	        proc1.next = head2.next;                     //append list 2 to list 1       
	        proc2.next = null;
	        
	        return head1.next;
	    }
	
	public static void printList(ListNode head)
	{
		while(head !=  null)
		{
			System.out.println(head.val);
			head = head.next;
		}
	}
	

}
