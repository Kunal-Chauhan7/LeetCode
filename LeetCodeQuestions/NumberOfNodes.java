package kunal;

public class NumberOfNodes {
	public static int TotalNodes(TreeNode root) {
		if(root==null)
			return 0;
		int leftAns = TotalNodes(root.left);
		int rightAns = TotalNodes(root.right);
		return leftAns + rightAns + 1;
	}
}

