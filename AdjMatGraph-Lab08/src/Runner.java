
public class Runner 
{
	public static void main(String[] args)
	{
		AdjMatGraph graph = new AdjMatGraph(7);
		graph.initGraph();
		graph.addEdge(0,1,10);
		graph.addEdge(0,3,20);
		
		graph.addEdge(1,3,10);
		
		graph.addEdge(2,0,10);
		graph.addEdge(2,4,10);
		graph.addEdge(2,5,20);
		
		graph.addEdge(3,2,20);
		graph.addEdge(3,4,10);
		
		graph.addEdge(4,5,10);
		graph.addEdge(4,6,15);
		
		System.out.println("Printing DFS");
		graph.printDFS();
		graph.printDFS(0);
		
		System.out.println("Printing BFS");
		graph.printBFS();
		graph.printBFS(0);
	}
}
