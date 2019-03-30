//Maggie O'Connell
import java.util.*;
import java.io.*;

public class WordFinder 
{
	char[][] crossword;
	char[][] markedVerts;
	ArrayList<Character> word = new ArrayList<Character>();
	String finalWord = null;
	//use depth first search
	
	public WordFinder()
	{
		crossword = new char[5][5];
	}
	
	
	public void initGraph()
	{
		markedVerts = new char[5][5];
		for(int x = 0; x < 5; x++)
		{
			for(int y = 0; y < 5; y++)
			{
				crossword[x][y] = '0';
				markedVerts[x][y] = '0';
			}
		}
		
	}
	
	public void addChar(int x, int y, char aChar)
	{
		crossword[x][y] = aChar;
	}
	
	public String findWord(int x , int y)
	{
		if(markedVerts[x][y] == '0')//makes sure no node is hit twice
		{
			markedVerts[x][y] = crossword[x][y]; //fills markedVerts
			word.add(crossword[x][y]); //begins creating word to be returned
			if(word.size() == 5) 
			{
				finalWord = word.get(0) + "" + word.get(1) + word.get(2) + word.get(3) + word.get(4);
				word.clear();
			}
			//recursive calls that check surrounding characters
			if(x == 0 && y == 0)
			{
				findWord(x+1,y);
				findWord(x+1,y+1);
				findWord(x,y+1);
			}
			else if(y == 0 && x != 0 && x != 4)
			{
				findWord(x-1,y);
				findWord(x-1,y+1);
				findWord(x,y+1);
				findWord(x+1,y+1);
				findWord(x+1,y);
			}
			else if(x == 4 && y == 0)
			{
				findWord(x-1,y);
				findWord(x-1,y+1);
				findWord(x,y+1);
			}
			else if(x == 4 && y != 4 && y != 0)
			{
				findWord(x,y-1);
				findWord(x-1,y-1);
				findWord(x-1,y);
				findWord(x-1,y+1);
				findWord(x,y+1);
			}
			else if(x == 4 && y == 4)
			{
				findWord(x,y-1);
				findWord(x-1,y-1);
				findWord(x-1,y);
			}
			else if(x != 0 && x != 4 && y == 4)
			{
				findWord(x-1,y);
				findWord(x-1,y-1);
				findWord(x,y-1);
				findWord(x+1,y-1);
				findWord(x+1,y);
			}
			else if(x == 0 && y == 4)
			{
				findWord(x,y-1);
				findWord(x+1,y-1);
				findWord(x+1,y);
			}
			else if(x == 0 && y != 0 && y != 4)
			{
				findWord(x,y-1);
				findWord(x+1,y-1);
				findWord(x+1,y);
				findWord(x+1,y+1);
				findWord(x,y+1);
			}
			else
			{
				findWord(x-1,y-1);
				findWord(x-1,y);
				findWord(x-1,y+1);
				findWord(x,y+1);
				findWord(x+1,y+1);
				findWord(x+1,y);
				findWord(x+1,y-1);
				findWord(x,y-1);
			}
		}
		return finalWord;
	}
}
