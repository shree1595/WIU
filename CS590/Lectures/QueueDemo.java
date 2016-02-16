/*
 *  insert elements: 10, 20, 30 to the queue and then remove one by one until the queue is empty 
 */

import java.util.*;
public class QueueDemo {
	
	public static void main(String[] args)
	
	{
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(10);
		que.offer(20);
		que.offer(30);
		
		while(!que.isEmpty())
		{
			System.out.println(que.poll());
		}
	}
	
}
