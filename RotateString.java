package kunal;

public class RotateString {
	public static boolean rotateString(StringBuilder s, StringBuilder goal, int tries) {
		if (tries <= 0)
	        return false;
	    if (s.toString().equals(goal.toString()))
	        return true;
	    else {
	        char firstChar = s.charAt(0);
	        s.deleteCharAt(0);
	        s.append(firstChar);
	        return rotateString(s, goal, tries - 1);
	    }
    }
	
	public static boolean rotateString(String s, String goal) {
		StringBuilder Ns = new StringBuilder(s);
		StringBuilder Ng = new StringBuilder(goal);
        int tries = s.length();
        return rotateString(Ns, Ng, tries);
    }
	public static void main(String[] args) {
		System.out.println(rotateString("abcde", "cdeab"));
	}
}
