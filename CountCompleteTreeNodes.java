package kunal;

public class CountCompleteTreeNodes {
	
	public int countNodes(TreeNode root) {
		if(root==null)
			return 0;
		int leftans = countNodes(root.left);
		int rightans = countNodes(root.right);
		return leftans +  rightans +  1;
    }
	
	public static void main(String[] args) {
		int a = -5;
		int b = 2;
		System.out.println(a/b);
		System.out.println(a%b);
	}
}
