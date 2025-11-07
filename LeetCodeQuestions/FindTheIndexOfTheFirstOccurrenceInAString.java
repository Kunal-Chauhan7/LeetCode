package kunal;

public class FindTheIndexOfTheFirstOccurrenceInAString {
	public static int strStr(String haystack, String needle) {
		int length = needle.length();
		for (int i = 0; i < haystack.length() - length+1; i++) {
			String subs = haystack.substring(i, i+length);
			if(subs.equals(needle))
				return i;
		}
		return -1;
    }
	public static void main(String[] args) {
		System.out.println(strStr("leetcode", "code"));
	}
}
