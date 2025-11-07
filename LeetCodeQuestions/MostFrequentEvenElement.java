package kunal;

import java.util.HashMap;

public class MostFrequentEvenElement {
	public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int result = -1;
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                int count = map.get(num);
                if (count > maxCount || (count == maxCount && num < result)) {
                    maxCount = count;
                    result = num;
                }
            }
        }
        return result;
    }
}
