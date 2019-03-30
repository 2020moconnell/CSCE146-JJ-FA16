/*Maggie O'Connell
 * Lab 04
 * 9/16
 */
public class LinearVsBinary 
{

	private int lineCount = 0;
	private int binCount = 0;
	private boolean isLinear = false;
	private boolean isBinary = false;
	private int totalCountLine;
	private int totalCountBin;
	
	//constructor
	public LinearVsBinary(int[] arr)
	{
		
	}
	
	//linear search method
	public boolean linearSearch(int[] a, int value)
	{
		for(int i=0; i < a.length; i++)
		{
			lineCount++;
			if(a[i] == value)
			{
				isLinear = true;
				return true;
			}
		}
		return false;
	}
	public void forLine()//returns result for linear search
	{
		if (isLinear == true)
		{
			System.out.println("Found");
			System.out.println("Linear Checks: " + lineCount);
			totalCountLine += lineCount;
			lineCount = 0;
			isLinear = false;
		}
		else
		{
			System.out.println("Not Found");
			System.out.println("Linear Checks: " + lineCount);
			totalCountLine += lineCount;
			lineCount = 0;
		}
			
	}
	
	//binary search method
	public boolean binarySearch(int[] a, int value)
	{
		int minIndex = 0;
		int maxIndex = a.length -1;
		
		while(minIndex <= maxIndex)
		{
			int midIndex = (maxIndex + minIndex)/2;
			if(a[midIndex] == value)
			{
				binCount++;
				isBinary = true;
				return true;
			}
			else if(value > a[midIndex])
			{
				binCount++;
				minIndex = midIndex + 1;
			}
			else
			{
				binCount++;
				maxIndex = midIndex - 1;
			}
		}
		return false;
	}
	

	public void forBin() //returns result for binary search
	{
		if (isBinary == true)
		{
			System.out.println("Found");
			System.out.println("Binary Checks: " + binCount);
			totalCountBin += binCount;
			binCount = 0;
			isBinary = false;
		}
		else
		{
			System.out.println("Not Found");
			System.out.println("Binary Checks: " + binCount);
			totalCountBin += binCount;
			binCount = 0;
		}
			
	}
	
	public void getAverage()//gets average 
	{
		System.out.println("The average checks for Linear search is: " + (totalCountLine / 20));
		System.out.println("The average checks for binary search is: " + (totalCountBin / 20));
	}
	
	public int[] selectionSort(int[] a)// sorts the data so it can be serached
	{
		for(int i = 0; i < a.length; i++)
		{
			int smallestIndex = i;
			for(int j = i; j< a.length; j++)
			{
				if(a[j] < a[smallestIndex])
				{
					smallestIndex = j;
				}
			}
			if(smallestIndex != i)//swap
			{
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
			}
		}
		return a;
	}
	
}
