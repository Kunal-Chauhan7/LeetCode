package kunal;

import java.util.HashSet;

public class WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }
        int x = 0, y = 0; 
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // Up, right, down, left
        int res = 0, d = 0;

        for (int command : commands) {
            if (command == -1) {
                d = (d + 1) % 4;
            } else if (command == -2) {
                d = (d - 1 + 4) % 4;
            } else {
                int dx = direction[d][0];
                int dy = direction[d][1];
                for (int j = 0; j < command; j++) {
                    int nextX = x + dx;
                    int nextY = y + dy;
                    if (obstacleSet.contains(nextX + "," + nextY))break;
                    x = nextX;
                    y = nextY;
                }
            }
            res = Math.max(res, x * x + y * y);
        }
        return res;
    }
}
