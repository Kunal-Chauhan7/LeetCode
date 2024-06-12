package kunal;

public class RepeatedStringMatch {
	public static int repeatedStringMatch(String a, String b) {
		int n = b.length()/a.length();
		StringBuilder ans = new  StringBuilder("");
		int rev = 0;
		for (int i = 0; i <=n+1; i++) {
			ans = ans.append(a);
			rev++;
			if(ans.toString().contains(b))
				return rev;
		}
		return -1;
    }
	public static void main(String[] args) {
		System.out.println(repeatedStringMatch("a", "aa"));
	}
}
