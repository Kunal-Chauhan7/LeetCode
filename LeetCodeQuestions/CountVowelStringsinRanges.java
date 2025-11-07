package kunal;

public class CountVowelStringsinRanges {
    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        boolean[] isVowelWord = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                isVowelWord[i] = true;
            } else {
                isVowelWord[i] = false;
            }
        }
        int[] prefixSum = new int[words.length + 1];
        for (int i = 0; i < words.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + (isVowelWord[i] ? 1 : 0);
        }
        for (int q = 0; q < queries.length; q++) {
            int start = queries[q][0];
            int end = queries[q][1];
            ans[q] = prefixSum[end + 1] - prefixSum[start];
        }
        return ans;
    }
}
