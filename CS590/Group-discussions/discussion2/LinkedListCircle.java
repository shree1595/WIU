/*
 *  Course: CS590
 *  LinkedListCircle.java - sample code to detect if the linked list has a circle
 *  Author: Zheng Li
 */
public class LinkedListCircle {
    public boolean hasCycle(ListNode head) {
        
        if (head == null) return false;
        
        ListNode slow = head;   // slow moves one step one time
        ListNode fast = head;   // fast moves two steps at a time
        
        while (fast != null && fast.next != null)
        {
             slow = slow.next;
             fast = fast.next.next;
            if (slow == fast)
            {
                return true;
            }
        }        
        return false;
    }
}

