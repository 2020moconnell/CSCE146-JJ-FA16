import java.io.*;
import java.util.*;

public class VideoGameCollectionManager <T>
{
	public GenericLinkedList<VideoGame> games;
	private static final String DELIM = "/t";
	
	public VideoGameCollectionManager()
	{
		games = new GenericLinkedList<VideoGame>();
	}
	
	public void addGame(VideoGame aVideoGame)
	{
		games.insert(aVideoGame);
	}
	
	public void removeGame(VideoGame aVideoGame)
	{
		games.resetIteration();
		while(games.moreToIterate())
		{
			if(games.getDataAtCurrent().equals(aVideoGame))
			{
				games.removeCurrent();
				break;
			}
			games.goToNext();
		}
	}
	
	
	public void readFromFile(String aFileName)
	{
		Scanner fileScanner = new Scanner(aFileName);
		fileScanner.useDelimiter("/t");
		String name, console;
		while (fileScanner.hasNext())
		{
			name = fileScanner.next();
			console = fileScanner.next();
			games.insert(new VideoGame(name, console));
			
		}
		
			fileScanner.close();
	}
	
	/*public GenericLinkedList<VideoGame> search(String name, String console)
	{
		GenericLinkedList<VideoGame> retList = new...
		games.resetIteration();
		while(game.moreToIterate())
		{
			VideoGame currGame = games.getDataAtCurrent();
			if((name.equals("*") || currGame.getName().contains(name)))
			{
				retGame.insert(currGame)
			}
			games.moreToInterate();
		}
		*/
	}
	
	

