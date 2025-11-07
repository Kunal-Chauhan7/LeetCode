package kunal;

public class LCA {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || root== p || root == q)
			return root;
		TreeNode leftAns = lowestCommonAncestor(root.left, p, q);
		TreeNode RightAns = lowestCommonAncestor(root.right, p, q);
		if(leftAns==null)
			return RightAns;
		else if(RightAns==null)
			return leftAns;
		else
			return root;
    }
}
