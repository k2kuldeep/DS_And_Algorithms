// Breadth First Search algorithm
import java.util.*;

public class BFS_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph(4);
		
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
		
        //g.printGraph();
        g.bfs(0);
	}

}
class Graph
{
	private int V;
	private LinkedList<Integer> adjlist[];
	
	Graph(int v){
		V = v;
		adjlist = new LinkedList[v];
		for(int i=0;i<v;i++)
			adjlist[i] = new LinkedList();
	}
	
	void addEdge(int v, int w){
		adjlist[v].add(w);
	}
	
	void printGraph(){
		for(int i=0;i<V;i++){
			System.out.println(adjlist[i]);
		}
	}
	
	void bfs(int s){
		
		boolean visited[] = new boolean[V];
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[s] = true;
		queue.add(s);
		
		while(!queue.isEmpty()){
			
			s = queue.poll();
			System.out.print(s+" ");
			
			Iterator<Integer> i = adjlist[s].listIterator();
			while(i.hasNext()){
				int next = i.next();
				
				if(!visited[next]){
					visited[next] = true;
					queue.add(next);
				}
			}
		}
		
	}
	
}