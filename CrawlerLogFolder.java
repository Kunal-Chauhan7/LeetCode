package kunal;
public class CrawlerLogFolder {
	public static int minOperations(String[] logs) {
        int counter = 0;
        for(String s : logs) {
        	if(s.equals("../")) {
        		if(counter>0)
        			counter--;
        	}
        	else if(!s.equals("./"))
        		counter++;
        }
        return counter;
    }
	public static void main(String[] args) {
		String[] logs = {"./","../","./"};
		System.out.println(minOperations(logs));
	}
}
