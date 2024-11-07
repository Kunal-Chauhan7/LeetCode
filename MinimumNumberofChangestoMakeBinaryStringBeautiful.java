package kunal;

public class MinimumNumberofChangestoMakeBinaryStringBeautiful {
    public int minChanges(String s) {
        int swap = 0;
        for (int i = 0; i < s.length() - 1; i+=2) {
            if(s.charAt(i)!=s.charAt(i+1))
                swap++;
        }
        return swap;
    }
}
