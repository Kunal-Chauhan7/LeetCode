import java.util.HashMap;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
//        if(s1.length()!=s2.length())return false;
//
//        int[] freq1 = new int[26];
//        int[] freq2 = new int[26];
//
//        for(char c : s1.toCharArray()){
//            freq1[c-'a']++;
//        }
//
//        for(char c : s2.toCharArray()){
//            freq2[c-'a']++;
//        }
//
//        for(int i = 0 ; i < 26 ; i ++){
//            if(freq1[i]!=freq2[i])return false;
//        }
//        return true;

        if(s1.length()!=s2.length())return false;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            if(!map1.containsKey(c))map1.put(c,1);
            else map1.put(c, (map1.get(c) + 1));
        }

        for(char c : s2.toCharArray()){
            if(!map2.containsKey(c))map2.put(c,1);
            else map2.put(c, (map2.get(c) + 1));
        }

        return map1.equals(map2);
    }
}
