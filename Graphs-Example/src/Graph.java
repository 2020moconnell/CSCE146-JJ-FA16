import java.util.*;
public class Graph 
{
	private class Vertex
	{
		String name;
		ArrayList<Edge> neighbours;
		public Vertex (String aName)
		{
			this.name = aName;
			this.neighbours = new ArrayList<Edge>();
		}
	}
	
	private class Edge
	{
		Vertex toVertex;
		double weight;
		public Edge(Vertex aVertex, double aWeight)
		{
			this.toVertex = aVertex;
			this.weight = aWeight;
		}
	}
	
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
	
	public void addVertex(String aName)
	{
		//make sure name is unique
		if(containsName(aName))
			return;
		Vertex v = new Vertex(aName);
		verticies.add(v);
		if(origin == null)
			origin = v;
	}
	
	private boolean containsName(String aName)
	{
		for(Vertex vert: verticies)
		{
			if(vert.name.equals(aName))
				return true;
		}
		return false;
	}
	
	public void addEdge(String fromVert, String toVert, double aWeight)
	{
		//find fromVert
		Vertex v1 = getVertex(fromVert);
		//find toVert
		Vertex v2 = getVertex(toVert);
		if(v1 == null || v2 == null)
			return;
		//make edge
		v1.neighbours.add(new Edge(v2, aWeight));
	}
	
	private Vertex getVertex(String aName)
	{
		for(Vertex vert: verticies)
		{
			if(vert.name.equals(aName))
				return vert;
		}
		return null; //no vertex with this name
	}
	
	public void depthFirstSearch()
	{
		markedVerts.clear();
		depthFirstSearch(origin);
	}
	private void depthFirstSearch(Vertex vert)
	{
		if(markedVerts.contains(vert))
			return;
		System.out.println(vert.name);
		markedVerts.add(vert);
		for(Edge edge: vert.neighbours)
		{
			depthFirstSearch(edge.toVertex);
		}
	}
	
	public void breadthFirstSearch()
	{
		markedVerts.clear();
		visitedVerts.clear();
		System.out.println(origin.name);
		//recursive BFS
		breadthFirstSearch(origin);
		
	}
	private void breadthFirstSearch(Vertex vert)
	{
		if(markedVerts.contains(vert))
			return;
		markedVerts.add(vert);
		for(Edge edge : vert.neighbours)
		{
			if(visitedVerts.contains(vert) || markedVerts.contains(vert))
				continue;
			System.out.println(edge.toVertex.name);
			visitedVerts.add(edge.toVertex);
		}
		for(Edge edge : vert.neighbours)
		{
			breadthFirstSearch(edge.toVertex);
		}
	}
	
	
}
