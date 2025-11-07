package kunal;

public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		return isSubsequence(s, t, 0, 0);
    }
	public boolean isSubsequence(String s, String t , int index1 , int index2) {
		if(index1==s.length())
			return true;
		if(index2==t.length())
			return false;
		else if(s.charAt(index1)==t.charAt(index2)) {
			index1++;
			index2++;
		}
		else {
			index2++;
		}
		return isSubsequence(s, t, index1, index2);
	}
}
