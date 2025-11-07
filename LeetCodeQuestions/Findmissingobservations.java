package kunal;

public class Findmissingobservations {
	public int[] missingRolls(int[] rolls, int mean, int n) {
		int m = rolls.length;
		int total_sum = (m+n)*mean;
		int sum = 0;
		for(int i : rolls) {
			sum+=i;
		}
		int missingSum = total_sum - sum;
		if(missingSum > 6 * n || missingSum < n) return new int[] {};
		int[] res = new int [n];
		int index = 0;
		while(n!=0) {
			int minToAdd = Math.min(6, missingSum-n+1);
			res[index++]=minToAdd;
			missingSum-=minToAdd;
			n--;
		}
		return res;
    }
}
