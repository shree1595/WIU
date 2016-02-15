/*
 *  Course: CS590
 *  PartitionLinkedList.java - sample code for partition list problem
 *  Author: Zheng Li
 */

public class PartitionLinkedList {
    public ListNode partition(ListNode head, int x) {
      ListNode dummy1 = new ListNode(-1);    // the dummy head of nodes less than x
      ListNode dummy2 = new ListNode(-1);    // the dummy head of nodes no less than x
      ListNode head1 = dummy1;
      ListNode head2 = dummy2;
      while (head != null)
      {
          if(head.val < x)
          {
              head1.next = head;
              head1 = head1.next;
          }
          else
          {
              head2.next = head;
              head2 = head2.next;
          }
          head = head.next;
      }
      
      head1.next = dummy2.next;  // bride the two sub lists together
      head2.next = null;
      
      return dummy1.next;
    }
}


 
