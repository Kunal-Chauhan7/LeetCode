package kunal;

//import java.util.HashSet;
//import java.util.Set;

public class DeterMineStringHalvesAreLike {
	public static boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int leftSideVowel = 0;
        int rightSideVowel = 0;
        
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
        		if(i < mid) {
        			leftSideVowel++;
    			}
    			else {
    				rightSideVowel++;
    			}	
        	}
		}
        return leftSideVowel == rightSideVowel;
	}
	
	
	
	// 						  OR
	
	
	
//	 public static boolean halvesAreAlike(String s) {
//		 Set<Character> vowels = new HashSet<>();
//		 int mid = s.length() / 2;
//		 vowels.add('a');vowels.add('e');vowels.add('i');
//		 vowels.add('o');vowels.add('u');vowels.add('A');
//		 vowels.add('E');vowels.add('I');vowels.add('O');
//		 vowels.add('U');
//		 return CountVowels(s.substring(0,mid), vowels) == CountVowels(s.substring(mid), vowels);
//	 }
//	 public static int CountVowels(String s , Set<Character> vowels) {
//		 int count = 0;
//		 for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if(vowels.contains(c))
//				count++;
//		}
//		 return count;
//	 }
	
	public static void main(String[] args) {
		System.out.println(halvesAreAlike("book"));
	}
}
