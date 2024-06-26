package kunal;

import java.util.ArrayList;

public class BalanceaBinarySearchTree {
	public void Inorder (TreeNode root , ArrayList<Integer> arr){
		if(root==null)
			return;
		Inorder(root.left,arr);
		arr.add(root.val);
		Inorder(root.right, arr);
	}
	public TreeNode CreateABST (ArrayList<Integer>listOfNodes,int low,int high) {
		if(low>high)
			return null;
		int mid = low+(high-low)/2;
		
		TreeNode root = new TreeNode(listOfNodes.get(mid));
		root.left = CreateABST(listOfNodes, low, mid-1);
		root.right = CreateABST(listOfNodes, mid+1, high);
		
		return root;
	}
	public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>listOfNodes = new ArrayList<>();
        Inorder(root, listOfNodes);
        return CreateABST(listOfNodes, 0, listOfNodes.size()-1);
    }
}
