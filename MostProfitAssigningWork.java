package kunal;

import java.util.Arrays;

public class MostProfitAssigningWork {
	public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
		int ans = 0 ;
		int ArrayOfDifficultyLength = Arrays.stream(difficulty).max().getAsInt();
		int[] diff = new int[ArrayOfDifficultyLength+1];
		for(int i = 0 ; i < profit.length ; i++) {
			diff[difficulty[i]] = Math.max(diff[difficulty[i]], profit[i]);
		}
		for(int i = 1 ; i <= ArrayOfDifficultyLength;  i++) {
			diff[i] = Math.max(diff[i],diff[i-1]);
		}
		for(int i : worker) {
			if(i>ArrayOfDifficultyLength) {
				ans+=diff[ArrayOfDifficultyLength];
			}
			else {
				ans+=diff[i];
			}
		}
		return ans;
    }
}
