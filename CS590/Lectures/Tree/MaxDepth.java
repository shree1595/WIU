/*
 *  Course: CS590
 *  MaxDepth.java - get the maximum depth of a binary tree
 *  Idea: using recursion - Tree height = 1 + max(height of left_subtree, height of right_subtree)
 *  
 */

public class MaxDepth {

	public static void main(String[] args) {     // Test Program
		
		TreeNode root=new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node1 = new TreeNode(1);
		TreeNode node0 = new TreeNode(0);
		root.leftChild = node5;
		node5.leftChild = node4;
		node5.rightChild = node1;
		node1.leftChild = node0;

		System.out.println(getMaxDep(root));		
	}
	
	public static int getMaxDep(TreeNode root)    // recursion
	{
		
		if(root == null) return -1;		
		
		int left_num = getMaxDep(root.leftChild);
		int right_num = getMaxDep(root.rightChild);
		
		/* Depth of the tree will be max(left, right) + 1 */
		return left_num > right_num ? left_num+1:right_num+1;
		
	}

}
