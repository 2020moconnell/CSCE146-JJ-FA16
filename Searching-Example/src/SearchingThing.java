
public class SearchingThing 
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		binarySearch(arr, 3);
	}
	
	public static boolean linearSearch(int[] a, int value)
	{
		for(int i=0; i < a.length; i++)
		{
			if(a[i] == value)
				return true;
		}
		return false;
	}
	
	public static boolean linearSearchRecur(int[] a, int value, int index)
	{
		if(a[index] == value)
			return true;
		else
		{
			index++;
			if(index >= a.length)
				return false;
			else
				return linearSearchRecur(a, value, index);
		}
	}
	
	public static boolean binarySearch(int[] a, int value)
	{
		int minIndex = 0;
		int maxIndex = a.length -1;
		
		while(minIndex <= maxIndex)
		{
			int midIndex = (maxIndex + minIndex)/2;
			if(a[midIndex] == value)
			{
				System.out.println("true");
				return true;
			}
			else if(value > a[midIndex])
				minIndex = midIndex + 1;// use + or - because we have already examined the midIndex
			else
				maxIndex = midIndex - 1;
		}
		return false;
	}
	
	public static boolean binarySearchRecur(int [] a, int value, int minIndex, int maxIndex)
	{
		int midIndex = (maxIndex + minIndex)/2;
		if(minIndex > maxIndex)
			return false;
		if(a[minIndex] == value)
			return true;
		else if(value > a[minIndex])
			return binarySearchRecur(a, value, midIndex + 1, maxIndex);
		else
			return binarySearchRecur(a, value, minIndex, maxIndex - 1);
	}
}
