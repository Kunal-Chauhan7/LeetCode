package kunal;

import java.util.Stack;

public class ImplimentationOfQueueUsingStack {
	Stack<Integer> s1;
	Stack<Integer> s2;
	public ImplimentationOfQueueUsingStack() {
		s1 = new Stack<>();
		s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.add(x);
    }
    
    public int pop() {
        while(!s1.isEmpty()) {
        	s2.add(s1.pop());
        }
        int x = s2.pop();
        while(!s2.isEmpty()) {
        	s1.add(s2.pop());
        }
        return x;
    }
    
    public int peek() {
    	while(!s1.isEmpty()) {
        	s2.add(s1.pop());
        }
        int x = s2.pop();
        s2.add(x);
        while(!s2.isEmpty()) {
        	s1.add(s2.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
