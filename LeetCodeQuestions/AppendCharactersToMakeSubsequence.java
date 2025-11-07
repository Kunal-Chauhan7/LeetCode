package kunal;

public class AppendCharactersToMakeSubsequence {
	public static int appendCharacters(String s, String t) {
		int ans = t.length();
		int pointer1 = 0;
		int pointer2 = 0;
		while(pointer1<s.length()&&pointer2<t.length()) {
			if(s.charAt(pointer1)==t.charAt(pointer2)) {
				pointer2++;
				ans--;
			}
			pointer1++;
		}
		return ans;
    }
	public static void main(String[] args) {
		System.out.println(appendCharacters("z", "abcde"));
	}
}
