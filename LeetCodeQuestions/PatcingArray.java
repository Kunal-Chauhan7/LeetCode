package kunal;

public class PatcingArray {
	public int minPatches(int[] nums, int n) {
		long maxReach = 1;
		int Patch = 0;
		int i=0;
		while(maxReach<=n) {
			if(i<nums.length&&nums[i]<=maxReach) {
				maxReach+=nums[i];
				i++;
			}else {
				maxReach+=maxReach;
				Patch++;
			}
		}
		return Patch;
    }
}
