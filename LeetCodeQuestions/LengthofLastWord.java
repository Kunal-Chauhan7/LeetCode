package kunal;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String str = s.strip();
        String[] strArr = str.split(" ");
        return strArr[strArr.length-1].length();
    }
}

