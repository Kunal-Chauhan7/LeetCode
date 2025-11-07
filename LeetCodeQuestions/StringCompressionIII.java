package kunal;

public class StringCompressionIII {
    public static String compressedString(String word) {
        StringBuilder str = new StringBuilder();
        int counter = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) == word.charAt(i)) {
                counter++;
            } else {
                while (counter > 9) {
                    str.append(9);
                    str.append(word.charAt(i - 1));
                    counter -= 9;
                }
                if (counter > 0) {
                    str.append(counter);
                    str.append(word.charAt(i - 1));
                }
                counter = 1;
            }
        }
        while (counter > 9) {
            str.append(9);
            str.append(word.charAt(word.length() - 1));
            counter -= 9;
        }
        if (counter > 0) {
            str.append(counter);
            str.append(word.charAt(word.length() - 1));
        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressedString("abcde"));
    }
}
