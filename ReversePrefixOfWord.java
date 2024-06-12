package kunal;

public class ReversePrefixOfWord {
	public static String reversePrefix(String word, char ch) {
		String ch2 = ""+ch;
		StringBuilder str = new StringBuilder(word);
		int index = str.indexOf(ch2);
		if(index!=-1) {
			StringBuilder reverse = new StringBuilder(word.substring(0,index+1));
			StringBuilder lastPart = new StringBuilder(word.substring(index+1));
			reverse.reverse();
			StringBuilder ans = reverse.append(lastPart);
			return ans.toString();
		}
		else {
			return str.toString();
		}
		
    }
	public static void main(String[] args) {
		System.out.println(reversePrefix("abcdefd",'d'));
	}
}
