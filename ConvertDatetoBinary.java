package kunal;

public class ConvertDatetoBinary {
	public static String decimalToBinary(int decimal) {
	    if (decimal == 0) {
	        return "0";
	    }
	    StringBuilder binary = new StringBuilder();
	    
	    while (decimal > 0) {
	    	binary.append(decimal & 1);
	    	decimal >>= 1;
	    	}
	    return binary.reverse().toString();
	}
	public static String convertDateToBinary(String date) {
		String[] arr = date.split("-");
		int index = 0;
		for(String i : arr) {
			int numberDate = Integer.parseInt(i);
			String s = decimalToBinary(numberDate);
			arr[index++] = s;
			}
		String ans = arr[0]+"-"+arr[1]+"-"+arr[2];
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(convertDateToBinary("2080-02-29"));
	}
}
