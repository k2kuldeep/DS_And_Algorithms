/*Dijkstra Algorithm Implementation - (Used to find shortest path from source to all vertices in a given graph)
 2 array - distance array and visited array. Initialize both the array.
 dist[src] = 0;
 repeat for remaining (V-1) vertices :
 	find next minimum vertex in dist[] array which is not visited and return its index value.(let index be u)
 	make visited[u] = true
 		for(v=0;v<V;v++)
 			if(visited[v]==false && graph[u][v]!=0 && dist[u]+graph[u][v]<dist[v])
 				dist[v] = dist[u]+graph[u][v];
 Now print the dist[] array which contains distance from src.
 */
public class Dijkstra_Algorithm {
	
	static final int V = 9;
	
	public static void main(String[] args) {
		
		int graph[][] = {{0,4,0,0,0,0,0,8,0},
						{4,0,8,0,0,0,0,11,0},
						{0,8,0,7,0,4,0,0,2},
						{0,0,7,0,9,14,0,0,0},
						{0,0,0,9,0,10,0,0,0},
						{0,0,4,14,10,0,2,0,0},
						{0,0,0,0,0,2,0,1,6},
						{8,11,0,0,0,0,1,0,7},
						{0,0,2,0,0,0,6,7,0}};
		
		int src = 0;
		int dest = 4;
		int dist[] = new int[V];
		boolean visited[] = new boolean[V];
		
		for(int i=0;i<V;i++)
			dist[i] = Integer.MAX_VALUE;
			//visited[i] = false;
		
		
		dist[src] = 0;
		
		for(int i=1;i<V;i++){
			
			int u = findNext(dist,visited);
			visited[u] = true;
			
			for(int v=0;v<V;v++)
				if(!visited[v] && graph[u][v]!=0 &&
				dist[u] + graph[u][v] < dist[v])
					dist[v] = dist[u]+graph[u][v];
		}
		
		System.out.println("src		destination");
		System.out.println(dest+"\t\t"+dist[dest]);
}

	private static int findNext(int[] dist, boolean[] visited) {
		
		int min = Integer.MAX_VALUE;
		int index = -1;
		
		for(int i=0;i<V;i++){
			if(!visited[i] && dist[i] <= min){		// dist[i]<min
				min = dist[i];
				index = i;
			}
		}
		
		return index;
	}
}
/*Note: This code calculates shortest distance but doesn't calculate path information
 *The code is for undirected graph, same Dijkstra function can be used for directed graphs also.
 *The code finds shortest distances from source to all vertices. If we are interested only in shortest distance from the source to a single target, 
 *we can break the for the loop when the picked minimum distance vertex is equal to target.
 *Time Complexity of the implementation is O(V^2). If the input graph is represented using adjacency list,
 *it can be reduced to O(E log V) with the help of binary heap.
 *Dijkstra’s algorithm doesn’t work for graphs with negative weight edges. 
 For graphs with negative weight edges, Bellman–Ford algorithm can be used.
 */