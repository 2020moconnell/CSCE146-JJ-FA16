/*
 * Maggie O'Connell
 * Lab 05
 */
import java.util.ArrayList;
import java.util.Scanner;
public class BortSortRunner 
{
	private static ArrayList<String> words = new ArrayList<String>();
	private static int[] nums;
	private static String[] words2;
	private static String temp;
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an array of words. Hit enter between each word. Use 'quit' to end.");
			while(!(temp = scan.nextLine()).equals("quit"))
			{
				words.add(temp);
			}
			if(temp.equalsIgnoreCase("quit"))
			{
				System.out.println("quitting");
				words2 = new String[words.size()];
				for(int y = 0 ; y < words.size(); y++)
				{
					words2[y] = words.get(y);
				}
				
				BortSort bort = new BortSort(words2);
				bort.mergeSort(bort.countBort());
				bort.print(words2);
			}
	}
}
