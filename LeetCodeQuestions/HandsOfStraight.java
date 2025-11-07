package kunal;

import java.util.TreeMap;

public class HandsOfStraight {
	public static boolean isNStraightHand(int[] hand, int groupSize) {
		if(hand.length%groupSize!=0)
			return false;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i:hand) {
			if(!map.containsKey(i))
				map.put(i, 1);
			else {
				int value = 1 + map.get(i);
				map.put(i, value);
			}
		}
		while(!map.isEmpty()) {
			int min_value = map.firstKey();
			for (int i = min_value; i < groupSize+min_value; i++) {
				if(!map.containsKey(i))
					return false;
				int count = map.get(i);
				if(count==1) map.remove(i);
				else map.put(i, map.get(i) - 1);
			}
		}
		return true;
    }
	public static void main(String[] args) {
		int [] arr = {1,2,3,6,2,3,4,7,8};
		
		System.out.println(isNStraightHand(arr, 3));
	}
}
