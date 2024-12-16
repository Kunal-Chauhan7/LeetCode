package kunal;

import java.util.ArrayList;
import java.util.Collections;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums)arr.add(i);
        while (k>0){
            int min = Collections.min(arr);
            int indexOfMin = arr.indexOf(min);
            arr.set(indexOfMin,min*multiplier);
            k--;
        }
        int ans[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i]= arr.get(i);
        }
        return ans;
    }
}
