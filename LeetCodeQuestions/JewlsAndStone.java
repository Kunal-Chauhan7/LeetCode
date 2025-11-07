package kunal;

import java.util.HashMap;

public class JewlsAndStone {
	public int numJewelsInStones(String jewels, String stones) {
		int ans = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < stones.length(); i++) {
			char c = stones.charAt(i);
			if(!map.containsKey(c))
				map.put(c, 1);
			else {
				int value = map.get(c);
				value++;
				map.put(c, value);
			}
		}
		for (int i = 0; i < jewels.length(); i++) {
			char c = jewels.charAt(i);
			if(map.containsKey(c))
				ans+=map.get(c);
		}
		return ans;
    }
}
