/*
 *  Course: CS590
 *  ValidBST.java - Check if the given BST is valid
 *  
 */
public class ValidBST {

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
		
		
		System.out.println(checkValidBst(root, Integer.MAX_VALUE, Integer.MIN_VALUE));
	}
	
	public static boolean checkValidBst(TreeNode root, int max, int min)
	{
		if(root == null) return true;
		
		if(root.item > max || root.item < min)
		{
			return false;			
		}
		
		return (checkValidBst(root.leftChild, root.item, min) && 
				checkValidBst(root.rightChild, max, root.item));		
	}
}
