import java.util.Scanner;
import java.io.File;

public class Manager 
{
	private QueueInterface<Character> queue;
	private StackInterface<Character> stack;
	
	public Manager() 
	{
		queue = new ArrayQueue<>();
		stack = new ArrayStack<>();
	}
	
	
	
	public void doIt(String fileName)
	{
		try
		{
			Scanner scan = new Scanner(new File(fileName));
			String line = scan.nextLine();
			for(int x = 0; x != line.length(); x++)
			{
				if (line.equals("+"))
				{
					
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
	/* use this to read the file
	 * String input = ...
	 * Scanner strScanner = new Scanner(input);
	 */
}
