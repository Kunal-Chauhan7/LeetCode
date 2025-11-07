package kunal;

public class Anagram {
	public boolean isAnagram(String s, String t) {
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		for(Character c : s.toCharArray()) {
			int index = c - 'a';
			arr1[index]++;
		}
		for(Character c : t.toCharArray()) {
			int index = c - 'a';
			arr2[index]++;
		}
		for(int i = 0 ; i<26;i++) {
			if(arr1[i]!= arr2[i])
				return false;
		}
		return true;
    }
}
