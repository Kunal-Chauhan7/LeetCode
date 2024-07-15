package kunal;

import java.util.HashMap;
import java.util.HashSet;

public class CreateBinaryTreeFromDescriptions {
	
	public TreeNode createBinaryTree(int[][] descriptions) {
		HashMap<Integer, TreeNode> map = new HashMap<>();
		HashSet<Integer> children = new HashSet<>();
		for(int i = 0 ; i < descriptions.length;i++) {
			int parentValue = descriptions[i][0];
			int childValue = descriptions[i][1];
			int isLeft = descriptions[i][2];
			children.add(childValue);
			TreeNode parentNode = map.getOrDefault(parentValue, new TreeNode(parentValue));
			TreeNode childrenNode = map.getOrDefault(childValue, new TreeNode(childValue));
			
			if(isLeft==1)
				parentNode.left = childrenNode;
			else
				parentNode.right = childrenNode;
			map.put(parentValue, parentNode);
			map.put(childValue, childrenNode);
		}
		for(int[] a:descriptions) {
			if(!children.contains(a[0]))
				return map.get(a[0]);
		}
		return null;
	}
}
