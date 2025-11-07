package kunal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindTheLargestValueInEachRow {

	public List<Integer> largestValues(TreeNode root) {
		ArrayList<Integer> list =  new ArrayList<>();
        if (root==null)
            return list;
		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);
		while(!que.isEmpty()) {
			int n = que.size();
			int maxElement = Integer.MIN_VALUE;
			while(n!=0) {
				TreeNode front = que.poll();
				if(front.val>maxElement)
					maxElement = front.val;
				if(front.left!=null)
					que.add(front.left);
				if(front.right!=null)
					que.add(front.right);
				n--;
			}
			list.add(maxElement);
		}
		return list;
    }
}
