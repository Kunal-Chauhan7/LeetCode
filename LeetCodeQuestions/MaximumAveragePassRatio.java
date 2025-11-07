package kunal;

import java.util.PriorityQueue;

public class MaximumAveragePassRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double diffA = ((double) (a[0] + 1) / (a[1] + 1)) - ((double) a[0] / a[1]);
            double diffB = ((double) (b[0] + 1) / (b[1] + 1)) - ((double) b[0] / b[1]);
            return Double.compare(diffB, diffA);
        });
        for (int[] c : classes) {
            pq.offer(c);
        }
        while (extraStudents > 0) {
            int[] topClass = pq.poll();
            topClass[0]++;
            topClass[1]++;
            pq.offer(topClass);
            extraStudents--;
        }
        double result = 0;
        for (int[] c : classes) {
            result += (double) c[0] / c[1];
        }
        return result / classes.length;
    }
}
