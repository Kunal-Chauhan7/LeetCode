package kunal;

public class CoutingBits {
	public static int[] countBits(int n) {
		int[] arr = new int[n+1];
		arr[0] = 0;
		for (int i = 1; i <= n; i++) {
			String s = Integer.toBinaryString(i);
			int numberOfOne = 0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '1')
					numberOfOne++;
			}
			arr[i] = numberOfOne;
		}
		return arr;
    }
	public static void main(String[] args) {
		int[] arr = countBits(5);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
