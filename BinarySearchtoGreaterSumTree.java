package kunal;

public class BinarySearchtoGreaterSumTree {	
	public TreeNode bstToGst(TreeNode root) {
		int [] sum = new int[1];
		if(root == null)
			return root;
		bstToGst(root,sum);
		return root;
    }
	public void bstToGst(TreeNode root,int[] sum) {
		if(root==null)
			return;
		bstToGst(root.right,sum);
		sum[0] += root.val;
		root.val = sum[0];
		bstToGst(root.left, sum);
    }
}
