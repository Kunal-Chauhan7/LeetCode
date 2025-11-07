package kunal;

import java.util.ArrayList;
import java.util.List;
class Trie{
	Trie[] children;
	boolean isEnd;
	public Trie() {
		children = new Trie[26];
	}
}

public class ReplaceWords {
	static Trie root;
	public static String search(String word) {
		Trie curr = root;
		int j = 0;
		for(char c : word.toCharArray()) {
			int index = c - 'a';
			j++;
			if(curr.children[index]==null)
				return word;
			else if(curr.children[index].isEnd) {
				return word.substring(0,j);
			}
			else {
				curr = curr.children[index];
			}
		}
		return word;
	}
	public static void add(String word) {
		Trie curr = root;
		for(char c : word.toCharArray()) {
			int index = c - 'a';
			if(curr.children[index]==null)
				curr.children[index] = new Trie();
			curr = curr.children[index];
		}
		curr.isEnd = true;
	}
	public static String replaceWords(List<String> dictionary, String sentence) {
		root = new Trie();
		for(String s:dictionary) {
			add(s);
		}
		StringBuilder ans = new StringBuilder();
		String[] words = sentence.split(" ");
		for(String s : words) {
			String str = search(s);
			ans.append(str).append(" ");
		}
		return ans.toString().strip();
    }
	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		System.out.println(replaceWords(s1, "aadsfasf absbs bbab cadsfafs"));
	}
}
