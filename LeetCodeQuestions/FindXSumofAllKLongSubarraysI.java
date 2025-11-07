package kunal;

import java.util.Arrays;

public class FindXSumofAllKLongSubarraysI {

    public int[] findXSum(int[] nums, int k, int x) {
        int[] ans = new int[nums.length-k+1];
        for(int i = 0 ; i < ans.length ; i++){
            int left = i;
            int right = i + k - 1;
            ans[i] = helper(left,right,nums,x);
        }
        return ans;
    }

    private int helper(int left, int right, int[] nums, int x) {

        int distinctNumbers = 0;
        int sum = 0;

        int[] freq = new int[51];
        for (int i = left; i <= right ; i++) {
            sum += nums[i];
            if(freq[nums[i]] == 0) distinctNumbers++;
            freq[nums[i]]++;
        }

        if(distinctNumbers<x)return sum;

        int resultSum = 0;
        for(int select = 0 ; select < x ; select++){
            int bestNumber = -1;
            int bestFrequency = -1;
            for(int i = 50 ; i >=1 ; i--){
                if(freq[i] > bestFrequency){
                    bestFrequency = freq[i];
                    bestNumber = i;
                }
            }
            if(bestNumber!=-1){
                resultSum+=bestNumber*bestFrequency;
                freq[bestNumber] = 0;
            }
        }
        return resultSum;
    }
}
