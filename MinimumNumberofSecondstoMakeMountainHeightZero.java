package kunal;

public class MinimumNumberofSecondstoMakeMountainHeightZero {
	public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
	    int n = workerTimes.length;
	    long[] times = new long[n];
	    for (int i = 0; i < n; i++) {
	        int workerTime = workerTimes[i];
	        long currentTime = 0;
	        int reducedHeight = 0;
	        int step = 1;
	        while (reducedHeight < mountainHeight) {
	            currentTime += workerTime * step; 
	            reducedHeight++; 
	            step++;
	        }

	        times[i] = currentTime;
	    }
	    long minSeconds = 0;
	    for (long time : times) {
	        minSeconds = Math.max(minSeconds, time);
	    }   
	    return minSeconds;
	}
}
