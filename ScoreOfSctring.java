package kunal;

public class ScoreOfSctring {
	public static int scoreOfString(String s) {
		int ans = 0;
		for (int i = 0; i < s.length()-1; i++) {
			int a = (int) s.charAt(i);
			int b = (int) s.charAt(i+1);
			int diff = Math.abs(a-b);
			ans+=diff;
		}
		return ans;
    }
	public static void main(String[] args) {
		System.out.println(scoreOfString("hello"));
	}
}
