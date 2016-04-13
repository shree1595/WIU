/*
 *  Course: CS590
 *  PreInTreeTraversal.java - Implementing preOrder and inOrder Tree Traversal
 *  algorithm using stack 
 *  
 */
import java.util.ArrayList;
import java.util.Stack;

public class PreInTreeTraversal { 

	public static void main(String[] args) { // test program
		
		TreeNode root=new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node1 = new TreeNode(1);
		TreeNode node0 = new TreeNode(0);
		root.leftChild = node5;
		node5.leftChild = node4;
		node5.rightChild = node1;
		node1.leftChild = node0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("pre-Order Traveral");
		preOrderTravel(root, list);
		System.out.println(list.toString());	
		list.clear();
		
		System.out.println("In-Order Traveral");
		inOrderTravel(root, list);
		System.out.println(list.toString());	
	}
	
	public static void preOrderTravel(TreeNode root, ArrayList<Integer> list)
	{
		Stack<TreeNode> stk = new Stack<TreeNode>();
		if (root == null) return;
		
		stk.push(root);
		
		while(!stk.isEmpty())
		{
			TreeNode temp = stk.pop();
			
			list.add(temp.item);			
			if(temp.leftChild != null ) stk.push(temp.leftChild);
			if(temp.rightChild != null ) stk.push(temp.rightChild);			
		}		
	}
	
	public static void inOrderTravel(TreeNode root, ArrayList<Integer> list)
	{
		Stack<TreeNode> stk = new Stack<TreeNode>();
		if (root == null) return;
		
		TreeNode curr = root;
		
		while(!stk.isEmpty() || curr != null)
		{
			if(curr != null)
			{
				stk.push(curr);
				curr = curr.leftChild;
			}
			else
			{
				TreeNode temp = stk.pop();
				list.add(temp.item);
				curr = temp.rightChild;				
			}			
		}
				
	}
}
