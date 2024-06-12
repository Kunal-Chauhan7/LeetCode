package kunal;

public class NumberOfLazerBeamsInBank {
	public int numberOfBeams(String[] bank) {
		int finalAns = 0;
		int previousOne = 0;
		for(int i = 0 ; i < bank.length ; i++) {
			int numberOf1 = 0;
			for (int j = 0; j < bank[i].length(); j++) {
				if(bank[i].charAt(j)=='1') {
					numberOf1++;
				}
			}
			if (previousOne == 0) {
				previousOne = numberOf1;
			}
			else {
				if(numberOf1!=0) {
					finalAns = finalAns + (previousOne*numberOf1);
					previousOne = numberOf1;
				}
			}
			
		}
		return finalAns;
    }
}
