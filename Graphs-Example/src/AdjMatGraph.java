import java.util.*;
public class AdjMatGraph 
{
	private static final int DEFAULT_VERTEX_COUNT = 10;
	private double[][] adjMatrix;
	private ArrayList<Integer> markedVerts;
	
	public AdjMatGraph()
	{
		adjMatrix = new double[DEFAULT_VERTEX_COUNT][DEFAULT_VERTEX_COUNT];
	}
	
	public AdjMatGraph(int size)
	{
		if(size > 1)
		{
			adjMatrix = new double[size][size];
		}
	}
	
	private void initGraph()
	{
		for(int x = 0; x < adjMatrix.length; x++)
		{
			for(int y = 0; y < adjMatrix[x].length; y++)
			{
				adjMatrix[x][y] = 0;
			}
		}
		markedVerts = new ArrayList<Integer>();
	}
	
	public void addEdge(int toVert, int fromVert, double weight)
	{
		if(isValidVert(toVert) == false || isValidVert(fromVert) == false || weight < 0)
			return;
		adjMatrix[toVert][fromVert] = weight;
	}
	private boolean isValidVert(int vert)
	{
		return vert >= 0 && vert < adjMatrix.length;
	}
	
	public void printDFS()
	{
		markedVerts.clear();
	}
	public void printDFS(int index)
	{
		System.out.println("Vertex " + index);
		markedVerts.add(index);
		for(int i = 0; i < adjMatrix[index].length; i++)
		{
			if(adjMatrix[index][i] != 0 && markedVerts.contains(i) == false)
			{
				printDFS(i);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
