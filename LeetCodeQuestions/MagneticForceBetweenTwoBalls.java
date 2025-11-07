package kunal;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
	public int maxDistance(int[] position, int m) {
		Arrays.sort(position);
		int ans = 0;
		int minDistance = 1;
		int maxDistance = position[position.length - 1] - position[0];
		while(minDistance<=maxDistance) {
			int midDistance = minDistance+(maxDistance-minDistance)/2;
			if(canPlaceBalls(position,m ,midDistance)){
				ans = midDistance;
				minDistance = midDistance + 1;
			}
			else {
				maxDistance = midDistance - 1;
			}
		}
		return ans;
    }

	private boolean canPlaceBalls(int[] position, int m, int midDistance) {
		int prevValue = position[0];
		int ballsCanBePlaced = 1;
		for(int i = 1 ; i < position.length ; i++) {
			if(position[i]-prevValue>=midDistance) {
				ballsCanBePlaced++;
				prevValue = position[i];
			}
			if(ballsCanBePlaced==m)
				break;
		}
		return ballsCanBePlaced>=m;
	}
}
