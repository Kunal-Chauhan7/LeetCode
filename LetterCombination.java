package kunal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombination {
	public List<String> letterCombinations(String digits) {
		if (digits.length()==0)
				return new ArrayList<>();
		HashMap<String, String> map = new HashMap<>();
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		ArrayList<String> ans = new ArrayList<>();
		letterCombinations(digits, map, "", 0,ans);
		return ans;
    }
	public void letterCombinations(String digits , HashMap<String, String> map ,String str ,int index,ArrayList<String> ans) {
		if(str.length() == digits.length()) {
			ans.add(str);
			return;
		}
		String toadd = map.get(digits.charAt(index)+"");
		for(Character c : toadd.toCharArray()) {
			letterCombinations(digits, map, str+c, index+1, ans);
		}	
	}
}
