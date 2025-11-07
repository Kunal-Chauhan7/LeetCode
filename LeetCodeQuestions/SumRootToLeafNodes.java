package kunal;

import java.util.ArrayList;

public class SumRootToLeafNodes {
	public static void PathToRoot(TreeNode root , String s,ArrayList<String> str) {
		if(root==null)
			return;
		if(root.left==null&&root.right==null)
			str.add(s+root.val);
		PathToRoot(root.left, s+""+root.val,str);
		PathToRoot(root.right, s+""+root.val,str);
	}
	public int sumNumbers(TreeNode root) {
		ArrayList<String> str = new ArrayList<>();
        PathToRoot(root, "",str);
        int sum = 0;
        for (int i = 0; i < str.size(); i++) {
			int k = Integer.valueOf(str.get(i));
			System.out.println(k);
			sum+=k;
		}
        return sum;
    }
}
