package kunal;

public class PassThePillow {
	public int passThePillow(int n, int time) {
		int cycle = time/(n-1);
		int rem = time%(n-1);
		if(cycle%2==0)
			return rem+1;
		return n-rem;
	}
}
