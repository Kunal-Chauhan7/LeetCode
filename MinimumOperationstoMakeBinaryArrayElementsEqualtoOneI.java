 package kunal;

public class MinimumOperationstoMakeBinaryArrayElementsEqualtoOneI {
	public int minOperations(int[] nums) {
		int flips = 0;
		for(int i = 0 ; i < nums.length;i++) {
			if(nums[i]==0) {
				if(i+3>nums.length)
					return -1;
				for(int j = 0 ; j < 3;j++) {
					if(nums[i+j]==1) 
						nums[i+j]=0;
					else
						nums[i+j]=1;
				}
				flips++;
			}
		}
		return flips;
    }
}
