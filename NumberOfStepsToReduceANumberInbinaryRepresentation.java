package kunal;

public class NumberOfStepsToReduceANumberInbinaryRepresentation {
	public static int numSteps(String s) {
		int res = 0;
		StringBuilder str = new StringBuilder(s);
		while(!(str.toString().equals("1"))) {
			if(str.charAt(str.length()-1)=='0') 
				str.deleteCharAt(str.length()-1);
			else {
				str = addOne(str);
			}
			res++;
		}
		return res;
	}
	public static StringBuilder addOne(StringBuilder str) {
		int i = str.length()-1;
		while(i>=0 && str.charAt(i)=='1') {
			str.setCharAt(i, '0');
			i--;
		}
		if(i==-1) {
			str.insert(0, '1');
		}
		else {
			str.setCharAt(i, '1');
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println(numSteps("1101"));
	}
}
