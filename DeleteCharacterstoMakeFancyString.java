package kunal;

public class DeleteCharacterstoMakeFancyString {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter <= 2) {
                ans.append(s.charAt(i));
            }
        }
        ans.insert(0, s.charAt(0));
        return ans.toString();
    }
}
