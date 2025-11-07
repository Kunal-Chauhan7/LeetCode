package kunal;

import java.util.Arrays;

public class LargestNumber {
	public String largestNumber(int[] nums) {
		int n = nums.length;
		String[] str = new String[n];
		int index = 0;
		for(int i : nums)str[index++] = String.valueOf(i);
		Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
		StringBuilder sb = new StringBuilder();
		for(String s : str)sb.append(s);
		String result = sb.toString();
		return result.startsWith("0")?"0":result;
    }
}
