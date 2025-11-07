package kunal;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseSubstringsBetweenEachPairofParentheses {
	public static String reverseParentheses(String s) {
		Stack<Character> stack = new Stack<>();
		ArrayList<Character>carr = new ArrayList<>();
		for(Character c : s.toCharArray()) {
			if(c==')') {
				while(stack.peek()!='('&&!stack.isEmpty()) {
					carr.add(stack.pop());
				}
				if(!stack.isEmpty()) {
					stack.pop();
				}
				for(int i = 0;i < carr.size();i++) {
					stack.push(carr.get(i));
				}
				carr.clear();
			}
			else {
				stack.push(c);
			}
		}
		StringBuilder str = new StringBuilder();
		while(!stack.isEmpty()) {
			str.append(stack.pop());
		}
		
		return str.reverse().toString();
    }
	public static void main(String[] args) {
		System.out.println(reverseParentheses("(u(love)i)"));
	}
}
