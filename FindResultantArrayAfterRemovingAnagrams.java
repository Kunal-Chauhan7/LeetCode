package kunal;

import java.util.ArrayList;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans= new ArrayList<>();
        ans.add(words[0]);
        for(int i = 1 ; i < words.length ; i++){
            String word1 = ans.getLast();
            String word2 = words[i];
            if(!isAnagram(word1,word2))
                ans.add(word2);
        }
        return ans;
    }
    public boolean isAnagram(String word1 , String word2){
        int[] count = new int[26];
        if(word1.length()!=word2.length())return false;
        for(char c : word1.toCharArray()){
            count[c - 'a' ]++;
        }
        for(char c : word2.toCharArray()){
            count[c - 'a' ]--;
        }
        for(int num : count){
            if (num!=0) return false;
        }
        return true;
    }
}
