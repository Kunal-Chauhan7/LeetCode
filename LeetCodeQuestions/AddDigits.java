package kunal;

public class AddDigits {
	public static int addDigits(int num) {
		int number = num;
		while(number/10!=0) {
			int n = number;
			int sum = 0;
			while(n!=0) {
				int rem = n%10;
				sum+=rem;
				n = n/10;
			}
			number = sum;
		}
		return number;
    }
	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}
}
