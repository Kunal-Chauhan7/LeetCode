package kunal;

public class MaximumScoreAfterSplittingaString {
    public int maxScore(String s) {
        int max = 0;
        int TotalOne = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                TotalOne++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int numberOfZeroOnLeft = 0;
            int numberOfOneOnLeft = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0')
                    numberOfZeroOnLeft++;
                else
                    numberOfOneOnLeft++;
            }
            int result = numberOfZeroOnLeft + (TotalOne - numberOfOneOnLeft);
            if (result > max) {
                max = result;
            }
        }
        return max;
    }
}
