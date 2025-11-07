package kunal;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if(root==null)
			return false;
		if(root.left==null&&root.right==null&&root.val - targetSum==0)
			return true;
		if(targetSum-root.val==0)
			return true;
		if(targetSum-root.val<0)
			return false;
		return hasPathSum(root.left, root.val - targetSum ) || hasPathSum(root.right, root.val - targetSum);
		}
}
