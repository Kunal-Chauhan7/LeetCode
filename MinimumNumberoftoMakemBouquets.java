package kunal;

import java.util.Arrays;

public class MinimumNumberoftoMakemBouquets {
	public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (((long)m * k) > n) return -1;
        int minRange = Arrays.stream(bloomDay).min().getAsInt();
        int maxRange = Arrays.stream(bloomDay).max().getAsInt();
        while(minRange<maxRange) {
        	int mid = minRange+(maxRange-minRange)/2;
        	if(possible(bloomDay, mid, m, k))
        		maxRange = mid;
        	else
        		minRange = mid+1;
        }
        return minRange;
    }
    boolean possible(int[] arr, int day, int m, int k) {
        int counter = 0;
        int numberOfBouquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                counter++;
                if (counter == k) {
                    numberOfBouquets++;
                    counter = 0;
                }
            } else
                counter = 0;
            if (numberOfBouquets >= m)
                return true;
        }
        return false;
    }
}
