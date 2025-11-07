package kunal;
public class ValidWord {
    public boolean isValid(String word) {
        boolean containVowel = false;
        boolean containConsonant = false;
        if(word.length()<3) return false;
        for(char c : word.toCharArray()){
            if((c >= '0' && c<= '9') || (c>='a' && c <='z') || (c >= 'A' && c<= 'Z')){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') containVowel = true;
                if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') containVowel = true;
                if(!(c >= '0' && c<= '9')) containConsonant = true;
                continue;
            }
            else return false;
        }
        return containConsonant && containVowel;
    }
}
