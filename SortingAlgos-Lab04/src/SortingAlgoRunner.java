/*Maggie O'Connell
 * Lab 04
 * 9/16
 */
public class SortingAlgoRunner 
{
	public static void main(String[] args)
	{
		int[] array = new int[1000];
		for (int x = 0; x < 1000; x++)
		{
			array[x] = ((int) (Math.random() * 1000));
		}
		
		LinearVsBinary search = new LinearVsBinary(array);
		search.selectionSort(array);
		System.out.println("Welcome to the search tester.  We are going to see which algorithm performs the best out of 20 tests");
		
		for (int x = 1; x <= 20; x++)
		{
			int random = (int)(Math.random() * 1000);
			System.out.println("");
			System.out.println("Random is: " + random);
			System.out.println("Searching using the linear search");
			search.linearSearch(array, random);
			search.forLine();
			System.out.println("Searching using the binary search");
			search.binarySearch(array, random);
			search.forBin();
		}
		System.out.println("");
		search.getAverage();
		
		
	}
}
