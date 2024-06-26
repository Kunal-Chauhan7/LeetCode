package kunal;

public class ReverseAString {
	public void reverseString(char[] s) {
		if(s.length==1||s.length==0)
			return;
		int left = 0;
		int right = s.length-1;
		while(left<right) {
			char temp = s[left];
			s[left] = s [right];
			s[right] = temp;
			left++;
			right--;
		}
		return;
    }
}
