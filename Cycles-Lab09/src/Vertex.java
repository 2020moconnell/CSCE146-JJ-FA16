import java.util.ArrayList;

public class Vertex
	{
		String name;
		ArrayList<Edge> neighbours;
		public Vertex (String aName)
		{
			this.name = aName;
			this.neighbours = new ArrayList<Edge>();
		}
	}
