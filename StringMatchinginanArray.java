package kunal;

import java.util.ArrayList;
import java.util.List;

public class StringMatchinginanArray {
    public String ReturnMatchingString(String shortWord, String bigWord) {
        if (bigWord.contains(shortWord)) {
            return shortWord;
        }
        return null;
    }
    public List<String> stringMatching(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word1 = words[i];
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    String word2 = words[j];
                    String temp;
                    if (word1.length() > word2.length()) {
                        temp = ReturnMatchingString(word2, word1);
                    } else {
                        temp = ReturnMatchingString(word1, word2);
                    }
                    if (temp != null && !ans.contains(temp)) {
                        ans.add(temp);
                    }
                }
            }
        }
        return ans;
    }
}