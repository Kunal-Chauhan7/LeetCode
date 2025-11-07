package kunal;

import java.util.ArrayList;
import java.util.Collections;

public class TwoSumIV {
	public static void AllNodes(TreeNode root , ArrayList<Integer>list) {
		if(root==null)
			return;
		list.add(root.val);
		AllNodes(root.left, list);
		AllNodes(root.right, list);
	}
	public boolean findTarget(TreeNode root, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		AllNodes(root, list);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if(list.get(i)+list.get(j)==k)
					return true;
			}
		}
		return false;
    }
}
