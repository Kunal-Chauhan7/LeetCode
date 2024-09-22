package kunal;

public class KthSmallestinLexicographicalOrder {
	public int findKthNumber(int n, int k) {
		long curr = 1;
		k -=1;
		while(k>0) {
			int nodes = countNodes(n,curr);
			if(k>=nodes) {
				curr++;
				k-=nodes;
			}
			else {
				curr*=10;
				k--;
			}
		}
		return (int)curr;
    }
	private int countNodes(long n , long curr) {
		long total = 0;
		long next = curr+1;
		while(curr<=n) {
			total+=Math.min(n-curr+1, next-curr);
			curr*=10;
			next*=10;
		}
		return (int) total;
	}
}
