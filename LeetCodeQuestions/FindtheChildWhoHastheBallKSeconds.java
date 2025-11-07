package kunal;

public class FindtheChildWhoHastheBallKSeconds {
	public static int numberOfChild(int n, int k) {
		int i = k;
		int ballIndex = 0;
		boolean rev = false;
		while(i>0) {
			if(ballIndex==0) {
				rev = false;	
			}
			if(rev) {
				ballIndex--;
			}
			if(!rev) {
				ballIndex++;
			}
			if(ballIndex==n-1) {
				rev=true;	
			}
			i--;
		}
		return ballIndex;
    }
	 public static void main(String[] args) {
		System.out.println(numberOfChild(4,2));
	}
}
