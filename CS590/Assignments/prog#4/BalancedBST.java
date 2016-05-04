/*
 *  Course: CS590
 *  BalancedBST.java - Check if the given BST is balanced using recursion
 *  
 */

public class BalancedBST {

	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node1 = new TreeNode(1);	
		TreeNode node4 = new TreeNode(4);
		TreeNode node7 = new TreeNode(7);
		root.rightChild = node6;
		root.leftChild = node4;
		node4.leftChild = node1;
		node4.rightChild = node7;
		
		
		System.out.println(checkBalanced(root));
	}
	
		
	
	public static boolean checkBalanced(TreeNode root) {
		if (root == null)
			return true;
 
		if (getHeight(root) == -1)
			return false;
 
		return true;
	}
 
	public static int  getHeight(TreeNode root) {
		if (root == null)
			return 0;
 
		int left = getHeight(root.leftChild);
		int right = getHeight(root.rightChild);
 
		if (left == -1 || right == -1)
			return -1;
 
		if (Math.abs(left - right) > 1) {
			return -1;
		}
 
		return Math.max(left, right) + 1;
 
	}
	
}
