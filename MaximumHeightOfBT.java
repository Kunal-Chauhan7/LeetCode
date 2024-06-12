package kunal;

public class MaximumHeightOfBT {
	public int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		int leftPart = maxDepth(root.left);
		int rightPart = maxDepth(root.right);
		return Math.max(leftPart, rightPart)+1;
    }
}
