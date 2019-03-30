import java.util.*;
import java.io.*;

public class VideoGameCollectionRunner 
{
	public static void main(String[] args)
	{
		GenericLinkedList games = new GenericLinkedList();
		System.out.println("Welcome to the Video Game database! /n Please enter a file name to begin");
		
		Scanner scan = new Scanner(System.in);
		String fileName = scan.next();
		File read = new File(fileName);
		
		System.out.println("Enter Enter 1 to load another video game database\nEnter 2 to search the database\n"
					+ "Enter 3 to print current results\nEnter 4 to print current results to file\nEnter 0 to quit");
		Scanner scan1 = new Scanner(System.in);
		String action = scan1.next();
		
		if(scan.equals("1") || scan.equals("2") || scan.equals("3") || scan.equals("4"))
		{
			switch(action)
			{
				case "1":
				{
					System.out.println("Please enter a file name");
					Scanner scan2 = new Scanner(System.in);
					String newFile = scan2.next();
					read = new File(newFile);
				}
				case "2":
				{
					System.out.println("Please enter a search term");
					Scanner scan3 = new Scanner(System.in);
					String searchTerm = scan3.next();
					Scanner fileScanner = null;
					try {
						fileScanner = new Scanner(read);
					} catch(FileNotFoundException e) {
						System.out.print("File Not Found.");
						System.exit(0);
					}
					fileScanner.useDelimiter("/t");
					String name, console;
					while (fileScanner.hasNext())
					{
						
						name = fileScanner.next();
						console = fileScanner.next();
						if (name.contains(searchTerm) || (console.contains(searchTerm)))
						{
							games.addGames(name, console);
						}
						
					}
					
						fileScanner.close();
				}
				case "3":
				{
					System.out.println("Here are your results");
					games.showList();
				}
				case "4":
				{
					System.out.println("Please enter the name of the file you would like to write to");
					Scanner scan4 = new Scanner(System.in);
					String fileTo = scan4.next();
					//add try catch
					PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileTo), false);
					Scanner fileScanner = new Scanner(read);
					fileScanner.useDelimiter("/t");
					String name, console;
					while (fileScanner.hasNext())
					{
						name = fileScanner.next();
						console = fileScanner.next();
						fileWriter.println(name + "/t" + console);
					}
					fileWriter.close();
				}

			}
		}
				
	}
}
