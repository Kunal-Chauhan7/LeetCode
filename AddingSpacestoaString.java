package kunal;

public class AddingSpacestoaString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder(s);
        int j = 0;
        for (int i : spaces){
            str.insert(i+j," ");
            j++;
        }
        return str.toString();
    }
}
