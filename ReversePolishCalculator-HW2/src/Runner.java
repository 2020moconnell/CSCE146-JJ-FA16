import java.util.*;
import java.io.*;
public class Runner 
{
	public static void main(String[] args)
	{
		ArrayStack<Integer> nums = null;
		File file;
		Scanner fileScanner;
		
		System.out.println("Welcome to the reverse polish calculator. Please enter a file name: ");
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		file = new File(line);
		try
		{
			fileScanner = new Scanner(file);//File vs String in parameter
			while(fileScanner.hasNext())
			{
				try
				{
					Integer.parseInt(line);
					nums.push(fileScanner.next());
				}
				catch(Exception e)
				{
					int one = (int) nums.pop();
					int two = (int) nums.pop();
					if(line.equals("/"))
						nums.push(one / two); 
					else if(line.equals("*"))
						nums.push(one * two);
					else if(line.equals("+"))
						nums.push(one + two);
					else if(line.equals("-"))
						nums.push(one);
					else
						System.out.println("Not formulated correctled");
				}
				nums.push(fileScanner.next());
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			System.out.println("Not a valid file name.");
		}
		
	}
}
