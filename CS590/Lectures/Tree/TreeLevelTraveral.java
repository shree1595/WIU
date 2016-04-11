/*
 *  Course: CS590
 *  TreeLevelTraveral.java - print all the node following the tree level
 *  
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelTraveral {

	public static void main(String[] args) {  // test program
		
		TreeNode root=new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node1 = new TreeNode(1);
		TreeNode node0 = new TreeNode(0);
		root.leftChild = node5;
		node5.leftChild = node4;
		node5.rightChild = node1;
		node1.leftChild = node0;

		System.out.println(getNodeTreeLevel(root).toString());	
	}
	
	public static ArrayList<Integer> getNodeTreeLevel(TreeNode root)
	{
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		
		Queue<TreeNode> que = new LinkedList<TreeNode>();  // Queue is to store the nodes level by level
		
		if (root != null) que.offer(root);
		
		int counter = 0;
		
		while(!que.isEmpty())
		{
			counter = que.size();                         // counter has the number of nodes at the current level
			while(counter > 0)
			{
				TreeNode curr = que.poll();               // curr is the processing node
				
				if(curr.leftChild != null ) que.offer(curr.leftChild);
				if(curr.rightChild != null ) que.offer(curr.rightChild);
				
				ret.add(curr.getItem());
				
				counter --;			
			}			
		}
		
		return ret;		
	}

}
