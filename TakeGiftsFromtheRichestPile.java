package kunal;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromtheRichestPile {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : gifts)queue.add(i);
        while (k>0){
            int temp = queue.poll();
            temp = (int) Math.sqrt(temp);
            queue.add(temp);
            k--;
        }
        for(int i : queue)ans+=i;
        return ans;
    }
}
