package kunal;

import java.util.HashSet;
import java.util.Set;

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int actual_sum = n * (n + 1) / 2;
        int array_sum = 0;
        int unique_sum = 0;
        Set<Integer> s = new HashSet<>();

        for (int a : nums) {
            array_sum += a;
        }

        for (int a : nums) {
            s.add(a);
        }

        for (int a : s) {
            unique_sum += a;
        }

        int missing = actual_sum - unique_sum;
        int duplicate = array_sum - unique_sum;

        return new int[]{duplicate, missing};
    }
}

