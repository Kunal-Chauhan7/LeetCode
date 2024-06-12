package kunal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrder {
	public List<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();
		if(root==null) {
			return ans;
		}
		return inorderTraversal(root, ans);
    }
	public List<Integer> inorderTraversal(TreeNode root , ArrayList<Integer> ans){
		if(root==null)
			return null;
		inorderTraversal(root.left , ans);
		ans.add(root.val);
		inorderTraversal(root.right, ans);
		return ans;		
	}
}
