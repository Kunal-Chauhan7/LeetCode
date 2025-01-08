package kunal;

public class CountPrefixandSuffixPairsI {
    private boolean isPrefixAndSuffix(String str1,String str2){
        if (str2.length() < str1.length())return false;
        boolean flag = false;
        String Preffix = str2.substring(0,str1.length());
        String Suffix = str2.substring(str2.length() - str1.length());
        if(str1.equals(Preffix) && str1.equals(Suffix))return true;
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i = 0 ; i < words.length ; i++){
            String word1 = words[i];
            for (int j = i+1; j < words.length; j++) {
                String word2 = words[j];
                if(isPrefixAndSuffix(word1,word2))ans++;
            }
        }
        return ans;
    }
}
