package kunal;

public class FindifArrayCanBeSorted {
    public boolean canSortArray(int[] nums) {
        int PrevMax = Integer.MIN_VALUE;
        int currMax = nums[0];
        int currMin = nums[0];
        int setBits = Integer.bitCount(nums[0]);
        for(int i = 1 ; i < nums.length ; i++){
            if(setBits==Integer.bitCount(nums[i])){
                currMax = Math.max(currMax,nums[i]);
                currMin = Math.min(currMin , nums[i]);
            }
            else{
                if(currMin<PrevMax)return false;
                PrevMax = currMax;
                setBits = Integer.bitCount(nums[i]);
                currMin = nums[i];
                currMax = nums[i];
            }
        }
        return currMin>PrevMax;
    }
}
