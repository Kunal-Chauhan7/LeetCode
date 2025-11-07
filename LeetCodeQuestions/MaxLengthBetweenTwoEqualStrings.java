package kunal;

import java.util.HashMap;

public class MaxLengthBetweenTwoEqualStrings {
	public static int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
		for(int i = 0 ; i<s.length();i++){
            for(int j = i+1;j<s.length();j++){
               if(s.charAt(i) == s.charAt(j)) {
            	   int currvalue = j-i-1;
            	   if(currvalue>max)
            		   max = currvalue;
               }
            }
        }
		return max;
    }
	
	public static int maxLengthBetweenEqualCharacters2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				max = Math.max(max, i - map.get(c)- 1); //find the value where the last time that char was found and subtract to find the length of the string in between the current char.
			}
			else {
				map.put(c, i);
			}
		}
        return max;
    }
	public static void main(String[] args) {
		System.out.println(maxLengthBetweenEqualCharacters2("abca"));
	}
}
