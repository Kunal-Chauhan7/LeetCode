package kunal;

public class MinimumLength {
	public int minimumLength(String s) {
		StringBuilder str = new StringBuilder(s);
		int left = 0;
		int right = str.length()-1;
		while(left<right&&str.charAt(left)==str.charAt(right)) {
			char c = str.charAt(left);
			while(left<=right&&c==str.charAt(left)) {
				left++;				
			}
			while(right>=left && str.charAt(right)==c) {
				right--;
			}
		}
		return right-left+1;
    }
}
