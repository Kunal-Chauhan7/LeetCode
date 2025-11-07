package kunal;

public class BullsAndCow {
	public static String getHint(String secret, String guess) {
		int bulls = 0;
		int cow = 0;
		int [] secretFreq = new int[10];
		int [] guessFreq = new int[10];
		for (int i = 0; i < secret.length(); i++) {
			if(secret.charAt(i)==guess.charAt(i))
				bulls++;
			else {
				int a = Integer.parseInt(""+secret.charAt(i));
				int b = Integer.parseInt(""+guess.charAt(i));
				secretFreq[a]++;
				guessFreq[b]++;
			}
		}
		for (int i = 0; i < 10; i++)
			cow+=Math.min(secretFreq[i], guessFreq[i]);

		return ""+bulls+"A"+cow+"B";
    }
	public static void main(String[] args) {
		System.out.println(getHint("1123", "0111"));
	}
}
