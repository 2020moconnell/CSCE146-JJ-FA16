
public class Runner 
{
	public static void main (String[] args)
	{
		Graph graph = new Graph();
		Vertex v1 = new Vertex("v1");
		Vertex v2 = new Vertex("v2");
		Vertex v3 = new Vertex("v3");
		Vertex v4 = new Vertex("v4");
		Vertex v5 = new Vertex("v5");
		Vertex v6 = new Vertex("v6");
		Vertex v7 = new Vertex("v7");
		//adding verticies
		graph.addVertex(v1);
		graph.addVertex(v2);
		graph.addVertex(v3);
		graph.addVertex(v4);
		graph.addVertex(v5);
		graph.addVertex(v6);
		graph.addVertex(v7);
		//adding edges
		graph.addEdge(v1, v5);
		graph.addEdge(v2, v1);
		graph.addEdge(v3, v1);
		graph.addEdge(v4, v2);
		graph.addEdge(v5, v2);
		graph.addEdge(v5, v3);
		graph.addEdge(v5, v7);
		graph.addEdge(v6, v3);
		graph.addEdge(v7, v4);
		graph.addEdge(v7, v6);
		//finding cycles
		graph.clearMarked(v1);
		graph.hasCycle(v1);
		
		graph.clearMarked(v2);
		graph.hasCycle(v2);
		
		graph.clearMarked(v3);
		graph.hasCycle(v3);
		
		graph.clearMarked(v4);
		graph.hasCycle(v4);
		
		graph.clearMarked(v5);
		graph.hasCycle(v5);
		
		graph.clearMarked(v6);
		graph.hasCycle(v6);
		
		graph.clearMarked(v7);
		graph.hasCycle(v7);
		
	}
}
