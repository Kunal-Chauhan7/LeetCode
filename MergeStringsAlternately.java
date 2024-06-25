public class MergeStringsAlternately{

	public String mergeAlternately(String word1, String word2) {
        if(word1.length()==0){
            return word2;
        }               
        if(word2.length()==0){
            return word1;
        }
        int i = 0;
        int j = 0;
        String ans = "";
        while(i<word1.length()&&j<word2.length()){
            ans+=word1.charAt(i++);
            ans+=word2.charAt(j++);
        }
        while(i<word1.length()){
            ans+=word1.charAt(i++);
        }
        while(j<word2.length()){
            ans+=word2.charAt(j++);
        }
        return ans;
    }

}