package kunal;

public class StringCompression {
	public static int compress(char[] chars) {
		StringBuilder str = new StringBuilder("");
		int start = 0;
		while(start<chars.length) {
			str.append(chars[start]);
			int count = 1;
			Character c = chars[start];
			while(start<chars.length-1&&c.equals(chars[start+1])) {
				count++;
				start++;
			}
			if(count>1) {
				str.append(count);				
			}
			start++;
		}
		str.getChars(0, str.length(), chars, 0);
		return str.length();
	}
}
