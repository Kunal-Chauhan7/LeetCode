package kunal;

public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] sent = sentence.split(" ");
        if(sent.length == 1){
            return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
        }
        for(int i = 1 ; i < sent.length ; i++){
            if(sent[i].charAt(0)!=sent[i-1].charAt(sent[i-1].length()-1))
                return false;
        }
        return sent[0].charAt(0) == sent[sent.length - 1].charAt(sent[sent.length - 1].length() - 1);
    }
}
