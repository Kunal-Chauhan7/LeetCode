package kunal;

public class MinimumNumberofValidStringstoFormTaegetI {
	public int minValidStrings(String[] words, String target) {
		int ans = 0;
		int index = 0;
		boolean contains = false; 
		for(String s : words) {
			for(int i = 0 ; i < s.length() ; i++) {
				if(index == target.length()) {
					return ans;
				}
				contains = false;
				if(s.charAt(i)==target.charAt(index)) {
					index++;
					contains = true;
				}
				if(contains)ans++;
			}
		}
		return -1;
    }
}
