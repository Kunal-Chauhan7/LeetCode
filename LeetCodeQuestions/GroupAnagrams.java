package kunal;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedChar = new String(chars);
            if(!map.containsKey(sortedChar))map.put(sortedChar,new ArrayList<>());
            map.get(sortedChar).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
