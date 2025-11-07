package kunal;

import java.util.HashSet;

public class ReportSpamMessage {
	public boolean reportSpam(String[] message, String[] bannedWords) {
		HashSet<String> set = new HashSet<>();
		for (String s : bannedWords) {
			set.add(s);
		}
		int counter = 2;
		for(String s : message) {
			if(set.contains(s)) {
				counter--;
				if(counter == 0)
					return true;
			}
		}
		return false;
    }
}
