package kunal;


public class MinimunNumbersOfStepsToMakeTwoStringsAnagram {

	public static int minSteps(String s, String t) {
		int[] ValuesOfS = new int[26];
		int[] ValuesOfT = new int[26];
		int count = 0;
		for(char c:s.toCharArray())
			ValuesOfS[c - 'a']++;
		for(char c : t.toCharArray())
			ValuesOfT[c-'a']++;
		for (int i = 0; i < 26; i++)
			count += Math.abs(ValuesOfS[i] - ValuesOfT[i]);
		return count / 2;
    }	
	public static void main(String[] args) {
		System.out.println(minSteps("leetcode", "practice"));
	}
}
