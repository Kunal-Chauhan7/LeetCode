package kunal;

public class MaximumNestingDepthOfTheParaentheses {
	public int maxDepth(String s) {
		int depth = 0;
		int count = 0;
		for(Character c : s.toCharArray()) {
			if(c=='(')
				count++;
			depth=Math.max(depth, count);
			if(c==')')
				count--;
		}
		return depth;
    }
}
