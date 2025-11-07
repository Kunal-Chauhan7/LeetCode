package kunal;

import java.util.Stack;

public class MaximumScoreFromRemovingSubstrings {
	public int maximumGain(String s, int x, int y) {
		Stack<Character> stack1 = new Stack<>() , stack2 = new Stack<>();
		int result = 0, max = Math.max(x, y),min = Math.min(x, y);
		char first = (x>y)?'a':'b',second = (x>y)?'b':'a';
		for(char c : s.toCharArray()) {
			if(!stack1.isEmpty()&&stack1.peek()==first&&c==second) {
				stack1.pop();
				result+=max;
			}
			else {
				stack1.push(c);
			}
		}
		while(!stack1.isEmpty()) {
			char c = stack1.pop();
			if(!stack2.isEmpty()&&stack2.peek()==first&&c==second) {
				stack2.pop();
				result+=min;
			}else {
				stack2.push(c);
			}
		}
		return result;
    }
}
