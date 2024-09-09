package kunal;

public class LongestPalindromicSubsequence {
	public static int longestPalindromeSubseq(String s) {
		if(s == null)
			return 0;
        StringBuilder str1 = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder(s).reverse();
        return longestPalindromeSubseq(str1, str2, 0, 0);
    }
	public static int longestPalindromeSubseq(StringBuilder str1 , StringBuilder str2 , int i , int j) {
		if(str1.length() == i || str2.length()==j)
			return 0;
		if(str1.charAt(i) == str2.charAt(j))
			return 1 + longestPalindromeSubseq(str1, str2, i+1, j+1);
		return Math.max(longestPalindromeSubseq(str1, str2, i, j+1), longestPalindromeSubseq(str1, str2, i+1, j));
	}
	public static void main(String[] args) {
		System.out.println(longestPalindromeSubseq("bbbab"));
	}
}
