package kunal;

public class MovePiecestoObtainaString {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int startIndex = 0;
        int targetIndex = 0;
        while (startIndex<n || targetIndex<n){
            while(startIndex<n&&start.charAt(startIndex)=='_')startIndex++;
            while(targetIndex<n&&target.charAt(targetIndex)=='_')targetIndex++;
            if(targetIndex == n && startIndex == n)return true;
            if(targetIndex == n || startIndex == n)return false;
            if((start.charAt(startIndex)!=target.charAt(targetIndex)) || (start.charAt(startIndex)=='L' && startIndex < targetIndex) || (start.charAt(startIndex)=='R' && startIndex > targetIndex))return false;
            startIndex++;
            targetIndex++;
        }
    return true;
    }
}
