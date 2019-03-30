//Maggie O'Connell
import java.util.ArrayList;
import java.util.Scanner;

public class Runner 
{
	private static ArrayList<String> dictionary = new ArrayList<String>();
	public static void main (String[] args)
	{
		String fileName = "dictionary.txt";
		String line = null;
		Scanner scan = new Scanner(fileName);
		String toPrint;
		while(scan.hasNext())
		{
			line = scan.nextLine();
			dictionary.add(line);
		}
		
		
		WordFinder finder = new WordFinder();
		finder.initGraph();
		finder.addChar(0,0, 'R');
		finder.addChar(0,1, 'A');
		finder.addChar(0,2, 'H');
		finder.addChar(0,3, 'J');
		finder.addChar(0,4, 'M');
		
		finder.addChar(1,0, 'Y');
		finder.addChar(1,1, 'U');
		finder.addChar(1,2, 'W');
		finder.addChar(1,3, 'W');
		finder.addChar(1,4, 'K');
		
		finder.addChar(2,0, 'R');
		finder.addChar(2,1, 'X');
		finder.addChar(2,2, 'N');
		finder.addChar(2,3, 'F');
		finder.addChar(2,4, 'M');
		
		finder.addChar(3,0, 'Q');
		finder.addChar(3,1, 'G');
		finder.addChar(3,2, 'E');
		finder.addChar(3,3, 'E');
		finder.addChar(3,4, 'B');
		
		finder.addChar(4,0, 'E');
		finder.addChar(4,1, 'O');
		finder.addChar(4,2, 'A');
		finder.addChar(4,3, 'P');
		finder.addChar(4,4, 'E');
		
		if(dictionary.contains(finder.findWord(0, 0)))
		{
			toPrint = finder.findWord(0,0);
			System.out.println(toPrint);
		}
	}
	
}
