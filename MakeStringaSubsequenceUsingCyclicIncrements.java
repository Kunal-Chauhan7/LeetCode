package kunal;

public class MakeStringaSubsequenceUsingCyclicIncrements {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;
        while(i<str1.length() && j < str2.length()){
            char a = str1.charAt(i);
            char b = str2.charAt(j);
            char newValue;
            if(a=='z'){
                newValue = 'a';
            }
            else {
                newValue = (char) (((int) a)+1);
            }
            if(a==b){
                i++;
                j++;
            }
            else if (newValue == b){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j == str2.length();
    }
}
