package kunal;

public class EqualSubstring {
	public int equalSubstring(String s, String t, int maxCost) {
		int l = s.length();
		int ans = -1;
		int left = 0;
		int cost = 0;
		for (int right = 0; right < l; right++) {
			cost+= Math.abs(s.charAt(right)-t.charAt(right));
			while(cost>maxCost) {
				cost-=Math.abs(s.charAt(left)-t.charAt(left));
				left++;
			}
			ans = Math.max(ans, right-left+1);
		}
		return ans;
    }
}
