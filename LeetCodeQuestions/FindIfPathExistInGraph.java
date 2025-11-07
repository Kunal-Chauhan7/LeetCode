package kunal;

import java.util.LinkedList;
import java.util.Queue;

public class FindIfPathExistInGraph {
	
	public boolean validPath(int n, int[][] edges, int source, int destination) {
		Queue<Integer> Unvisited = new LinkedList<>();
		if(source==destination)
			return true;
		boolean[] visited = new boolean[n];
		Unvisited.add(source);
		while(!Unvisited.isEmpty()) {
			int vertex = Unvisited.poll();
			if(vertex==destination) {
				return true;
			}
			visited[vertex] = true;
			for (int i = 0; i < edges.length; i++) {
				if(edges[vertex][i]==1&&!visited[i]) {
					visited[i] = true;
					Unvisited.add(i);
				}
			}
		}
		return false;
    }
	
}
