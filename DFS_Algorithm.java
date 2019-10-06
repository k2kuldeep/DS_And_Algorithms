// Depth First Search

import java.util.*;

public class DFS_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DFSGraph g = new DFSGraph(4);
		
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
		
        //g.printGraph();
        g.dfs(0);

	}

}

class DFSGraph{
	private int V;
	private LinkedList<Integer> adj[];
	
	DFSGraph(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i] = new LinkedList();
	}
	
	void addEdge(int v,int w){
		adj[v].add(w);
	}
	
	void dfs(int v){
		boolean visited[] = new boolean[V];
		
		DFSUtil(v, visited);
	}

	private void DFSUtil(int v, boolean[] visited) {
		// TODO Auto-generated method stub
		
		visited[v] = true;
		System.out.print(v+" ");
		
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()){
			int next = i.next();
			
			if(!visited[next]){
				DFSUtil(next, visited);
			}
		}
		
	}
}