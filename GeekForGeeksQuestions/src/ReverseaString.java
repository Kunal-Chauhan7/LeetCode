public class ReverseaString {
    public static String reverseString(String s) {

        int low = 0;
        int high = s.length()-1;

        char[] string = s.toCharArray();
        while(low<high){
            char temp = string[low];
            string[low] = string[high];
            string[high] = temp;
            low++;
            high--;
        }
        return new String(string);

        //return new StringBuilder(s).reverse().toString();
    }
}
