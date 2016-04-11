/*
 *  Course: CS590
 *  PathSum.java - check if the tree has a 
 *   root-to-leaf path such that adding up
 *   all the values along the path equals the given number
 *  
 */
public class PathSum {

	public static void main(String[] args) {  // test program
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node1 = new TreeNode(1);
		TreeNode node0 = new TreeNode(0);
		root.leftChild = node5;
		node5.leftChild = node4;
		node5.rightChild = node1;
		node1.leftChild = node0;

		System.out.println(checkPathSum(root, 8));	
	}
	
	public static boolean checkPathSum(TreeNode root, int val) 
	{
		if(root == null) return val == 0;
		
		/*
		 * Either left or right has such path, return true
		 */
		return (checkPathSum(root.leftChild, val - root.getItem()) ||checkPathSum(root.rightChild, val - root.getItem()));
		
	}
}
