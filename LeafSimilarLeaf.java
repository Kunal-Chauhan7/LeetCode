package kunal;

import java.util.ArrayList;

public class LeafSimilarLeaf {
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
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		Traverse(root2, arr2);
		Traverse(root1, arr1);
		if(arr2.size()!=arr1.size())
			return false;
		int i = 0;
		for (; i < arr1.size(); i++) {
			if(arr1.get(i)!=arr2.get(i))
				return false;
		}
		return true;
		}
	
	public static void Traverse(TreeNode root , ArrayList<Integer>arr) {
		if (root!=null) {
			if(root.left == null && root.right == null)
				arr.add(root.val);
			Traverse(root.left,arr);
			Traverse(root.right,arr);
		}
		else {
			return;
		}
	}
}
