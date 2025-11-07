package kunal;

public class MaxPathSum {
	int MaxPath = Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
        helper(root);
        return MaxPath;
    }
	int helper(TreeNode root) {
		if(root==null)
			return 0;
		int leftTreePart = Math.max(0, helper(root.left));
		int rightTreePart = Math.max(0, helper(root.right));
		MaxPath = Math.max(MaxPath, root.val + rightTreePart + leftTreePart );
		return root.val + Math.max(leftTreePart,rightTreePart);
	}
}
