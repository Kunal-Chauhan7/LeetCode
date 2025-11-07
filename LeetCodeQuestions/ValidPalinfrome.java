package kunal;

public class ValidPalinfrome {
	public boolean isPalindrome(String s) {
		if(s.isEmpty())
			return true;
		int low = 0;
		int high = s.length()-1;
		while(low<=high) {
			int char1 = s.charAt(low);
			int char2 = s.charAt(high);
			if(!Character.isLetterOrDigit(char1)) {
				low++;
			}
			else if (!Character.isLetterOrDigit(char2)) {
				high--;
			}
			else {
                if(Character.toLowerCase(char1)!=Character.toLowerCase(char2)) {
				    return false;
			    }
			    high--;
			    low++;
            }
		}
		return true;
    }
}
