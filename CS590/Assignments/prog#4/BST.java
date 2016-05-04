/*
 *  Course: CS 590
 *  constructPreOrderBST: construct a binary search tree based on the given preOrder Traversal 
 *  Hint: using recursion
 */

public class BST {

	public static void main(String[] args) {
			
		int[] input = {10, 5, 1, 7, 40, 50};		
		
		
		TreeNode root = constructPreOrderBST(input, 0, input.length - 1);

		inOrderTraversal(root);
	}		
	
	     
	    public static void inOrderTraversal(TreeNode root)
	    {
	    	if(root == null) return ;   
	    	
	    	
	    	
	    	inOrderTraversal(root.leftChild);    
	    	
	    	System.out.print(root.item + " ");
	    	
	    	inOrderTraversal(root.rightChild);   	
	    	
	    }

	
	public static TreeNode constructPreOrderBST(int[] input, int start, int end)
	{
		if(start > end) return null;
		
		TreeNode root = new TreeNode(input[start]);
		
		int nextStart = start + 1;
		
		for (; nextStart <= end; nextStart ++)
		{
			if(input[nextStart] >= input[start]) break;
		}
		
		TreeNode left_root = constructPreOrderBST(input, start+1, nextStart-1);
		TreeNode right_root = constructPreOrderBST(input, nextStart, end);
		
		root.leftChild = left_root;
		root.rightChild = right_root;
		
		return root;		
		
	}

}
