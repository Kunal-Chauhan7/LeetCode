package kunal;

public class RangeSumBST {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	public int rangeSumBST(TreeNode root, int low, int high) {
		int ans = 0;
		int rightvalue = 0;
		int leftvalue = 0;
		int rootvalue = 0;
		if (root!=null) {
			if(root.val>= low && root.val<=high) {
				rootvalue = root.val;
			}
			if(root.left!=null) {
				leftvalue = rangeSumBST(root.left, low, high);
			}
			if(root.right!=null) {
				rightvalue = rangeSumBST(root.right, low, high);
			}
		}
		ans = rootvalue + leftvalue + rightvalue;
		return ans;
    }
}
