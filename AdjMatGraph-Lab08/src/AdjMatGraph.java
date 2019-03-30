import java.util.*;
public class AdjMatGraph 
{
	private static final int DEFAULT_VERTEX_COUNT = 10;
	private int[][] adjMatrix;
	private ArrayList<Integer> markedVerts;
	private ArrayList<Integer> visitedVerts;
	int small = 0;
	
	public AdjMatGraph()
	{
		adjMatrix = new int[DEFAULT_VERTEX_COUNT][DEFAULT_VERTEX_COUNT];
	}
	
	public AdjMatGraph(int size)
	{
		if(size > 1)
		{
			adjMatrix = new int[size][size];
		}
	}
	//fills matrix with 0s
	public void initGraph()
	{
		for(int x = 0; x < adjMatrix.length; x++)
		{
			for(int y = 0; y < adjMatrix[x].length; y++)
			{
				adjMatrix[x][y] = 0;
			}
		}
		markedVerts = new ArrayList<Integer>();
		visitedVerts = new ArrayList<Integer>();
	}
	//adds an edge to the matrix
	public void addEdge(int toVert, int fromVert, int weight)
	{
		if(isValidVert(toVert) == false || isValidVert(fromVert) == false || weight < 0)
			return;
		adjMatrix[toVert][fromVert] = weight;
	}
	//checks to see if the vertex is valid
	private boolean isValidVert(int vert)
	{
		return vert >= 0 && vert < adjMatrix.length;
	}
	//depth first search
	public void printDFS()
	{
		markedVerts.clear();
	}
	public void printDFS(int index)
	{
		System.out.println("Vertex " + (index + 1));
		markedVerts.add(index);
		for(int i = 0; i < adjMatrix[index].length; i++)
		{
			if(adjMatrix[index][i] != 0 && markedVerts.contains(i) == false)
			{
				printDFS(i);
			}
		}
	}
	
	public void printBFS()
	{
		markedVerts.clear();

	}
	//breadth first search
	public void printBFS(int index)
	{
		//returns if the index is already contained in markedVerts
		if(markedVerts.contains(index))
		{
			return;
		}
		System.out.println("Vertex " + index);
		markedVerts.add(index);
		//collects data from matrix (finding edges) then adds them to the visitedVerts ArrayList
		for(int x = 0; x < adjMatrix[index].length; x++)
		{
			if(adjMatrix[index][x] != 0)
			{
				visitedVerts.add(x);
			}
		}
		if(visitedVerts.size() == 1)
		{
			small = visitedVerts.get(0);
		}
		//should check to see if the method has backtracked although 
		//never gets here because of first if statement
		else if(visitedVerts.size() == 0)
		{
			backTrack(markedVerts.get(markedVerts.size() - 2));
		}
		//sets recursive value
		for(int x = 0; x < visitedVerts.size() - 1; x++)
		{
			if(adjMatrix[index][visitedVerts.get(x)] <= adjMatrix[index][visitedVerts.get(x +1)])
			{
				small = visitedVerts.get(x);
			}
			else if (x == visitedVerts.size() - 2)
			{
				
				small = visitedVerts.get(visitedVerts.size() - 1);
			}
		}
		printBFS(small);
		visitedVerts.clear();
	}
	//helper method that should go backwards and index because 
	//a dead end has been reached
	private void backTrack(int index)
	{
		for(int x = 0; x < adjMatrix[index].length; x++)
		{
			if(adjMatrix[index][x] != 0 && !visitedVerts.contains(x))
			{
				visitedVerts.add(x);
			}
		}
	}
}
