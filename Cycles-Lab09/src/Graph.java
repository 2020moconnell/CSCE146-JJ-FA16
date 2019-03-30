import java.util.ArrayList;

public class Graph 
{
	Vertex origin;
	ArrayList<Vertex> verticies;
	ArrayList<Vertex> markedVerts;
	ArrayList<Vertex> visitedVerts;
	
	public Graph()
	{
		origin = null;
		verticies = new ArrayList<Vertex>();
		markedVerts = new ArrayList<Vertex>();
		visitedVerts = new ArrayList<Vertex>();
	}
	
	public void addVertex(Vertex aVertex)
	{
		//make sure name is unique
		if(containsName(aVertex))
			return;
		verticies.add(aVertex);
		if(origin == null)
			origin = aVertex;
	}
	
	private boolean containsName(Vertex aVertex)
	{
		for(Vertex vert: verticies)
		{
			if(vert.name.equals(aVertex))
				return true;
		}
		return false;
	}
	
	public void addEdge(Vertex fromVert, Vertex toVert)
	{
		if(fromVert == null || toVert == null)
			return;
		//make edge
		fromVert.neighbours.add(new Edge(toVert));
	}
	
	
	public void depthFirstSearch()
	{
		markedVerts.clear();
		depthFirstSearch(origin);
	}
	private void depthFirstSearch(Vertex vert)
	{
		System.out.println(vert.name);
		markedVerts.add(vert);
		for(Edge edge: vert.neighbours)
		{
			depthFirstSearch(edge.toVertex);
		}
		if(markedVerts.get(0).equals(vert))
		{
			for(int x = 0; x < markedVerts.size(); x++)
			{
				System.out.println(markedVerts.get(x));
			}
		}
	}
	
	public void clearMarked(Vertex vert)
	{
		markedVerts.clear();
		markedVerts.add(vert);
	}
	public void hasCycle(Vertex vert) //depth first search
	{
		//looks for end of the cycle
		if(markedVerts.size() != 1 && vert.equals(markedVerts.get(0)))
		{
			for(int x = 0; x < markedVerts.size(); x++)
			{
				System.out.println(markedVerts.get(x).name);
			}
			System.out.println(markedVerts.get(0).name);
			System.out.println("Cycle found");
			return;
		}
		//adds verticies to the array of marked verticies
		if(!markedVerts.contains(vert))
		{
			markedVerts.add(vert);
		}
		//recursive call
		for(Edge edge: vert.neighbours)
		{
			if(markedVerts.size() == 1)
			{
				hasCycle(edge.toVertex);
			}
			if(((!markedVerts.contains(edge.toVertex) && markedVerts.size() != 1)) || edge.toVertex.equals(markedVerts.get(0)))
			{
				hasCycle(edge.toVertex);
			}
		}
	}
	
}
