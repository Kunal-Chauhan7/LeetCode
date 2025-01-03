package kunal;

public class NumberofWaystoSplitArray {
    public int waysToSplitArray(int[] nums) {
        int ans = 0;
        long  currLeftSum = nums[0];
        long rightSum = 0;
        for (int i = 1; i < nums.length; i++) {rightSum+=nums[i];}
        for (int i = 1; i < nums.length ; i++) {
            if(currLeftSum>=rightSum)ans++;
            currLeftSum+=nums[i];
            rightSum -= nums[i];
        }
        return ans;
    }
}
