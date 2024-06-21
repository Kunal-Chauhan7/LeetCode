package kunal;

public class GrumpyBookstoreOwner {
//	public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//		int ans = 0;
//		for(int i = 0 ; i < customers.length ; i++) {
//			if(grumpy[i]==0)
//				ans+=customers[i];
//		}
//		int curr = 0;
//		int max = 0;
//		int start = 0;
//		for(int end = 0 ; end < customers.length;end++) {
//			if(grumpy[end]==1) {
//				curr+=customers[end];
//			}
//			if(end-start+1>minutes) {
//				if(grumpy[start]==1) {
//					curr-=customers[start];
//				}
//				start++;
//			}
//			max = Math.max(curr, max);
//		}
//		return max+ans;
//    }
	public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
		int ans = 0;
		for(int i = 0 ; i < customers.length ; i++) {
			if(grumpy[i]==0)
				ans+=customers[i];
		}
		int curr = 0;
		int start = 0;
		int max = 0;
		for(int end = 0; end < customers.length;end++) {
			if(grumpy[end]==1)
				curr+=customers[end];
			if(end-start+1>minutes) {
				if(grumpy[start]==1) {
					curr-=customers[start];					
				}
				start++;
			}
			max = Math.max(curr, max);
		}
		return ans+max;
    }
}
