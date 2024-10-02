package kunal;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class RankTransformofanArray {
    public int[] arrayRankTransform(int[] arr) {
        if (arr == null) return arr;
        TreeSet<Integer> uniqueValues = new TreeSet<>();
        for (int i : arr) {
            uniqueValues.add(i);
        }
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int value : uniqueValues) {
            rankMap.put(value, rank++);
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = rankMap.get(arr[i]);
        }
        return ans;
    }
}
