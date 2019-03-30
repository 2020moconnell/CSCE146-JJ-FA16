import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
//Maggie O'Connell
public class Runner 
{
	public static Game[] games = new Game[26];
	public static void main (String[] args)
	{
		System.out.println("Welcome to Sonic Sorter. Sonic Games will be sorted in order by year.");
		Scanner scan = new Scanner("SonicGames.txt"); //opens scanner to read file
		scan.useDelimiter("\t"); //uses tab to differentiate between year, name and console
		while(scan.hasNextLine())//checks if there is another game
		{
			for(int x = 0; x < 26; x++)
			{
				//reads year, name then console
				int year = scan.nextInt();
				String name = scan.next();
				String console = scan.next();
				games[x] = new Game(year, name, console);
			}
		}
		SonicSorter sorter = new SonicSorter(games);
		if(!scan.hasNextLine())
		{
			scan.close();
			sorter.quickSort(0, 25);
			for(int x = 0; x < 26; x++)
			{
				//prints
				System.out.println(games[x].getYear() + " " + games[x].getName() + " " + games[x].getConsole());
			}
		}
	}
}
