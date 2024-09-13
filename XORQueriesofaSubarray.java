package kunal;

public class XORQueriesofaSubarray {
	public int[] xorQueries(int[] arr, int[][] queries) {
		int[] ans = new int[queries.length];
		int index = 0;
		for(int[] i : queries) {
			int from = i[0];
			int to = i[1];
			int xorValue = 0;
			for(int j = from ; j <= to ; j++) {
				xorValue = xorValue ^ arr[j]; 
			}
			ans[index++] = xorValue;
		}
		return ans;
    }
}
