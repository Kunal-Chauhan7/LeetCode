package kunal;

public class ThreeConsecutiveOdds {
	public boolean threeConsecutiveOdds(int[] arr) {
		int consictive = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%2!=0) {
				consictive++;
				if(consictive==3)
					return true;
			}
			else {
				consictive = 0;
			}
		}
		return false;
    }
}
