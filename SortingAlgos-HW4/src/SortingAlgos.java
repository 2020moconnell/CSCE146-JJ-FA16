
public class SortingAlgos 
{
	static int checks1 = 0;
	static int checks2 = 0;
	static int checks3 = 0;
	static int checks4 = 0;
	static int num = 1;
	static int originalLen;
	static int pivotPoint;
	static int z =0;
	public static void selectionSort(int[] b)
	{
		int[] a = new int[b.length];
		for(int x = 0; x < b.length; x++)
		{
			a[x] = b[x];
		}
		
		for(int i = 0; i < a.length; i++)
		{
			int smallestIndex = i;
			for(int j = i; j< a.length; j++)
			{
				if(a[j] < a[smallestIndex])
				{
					smallestIndex = j;
					checks1++;
				}
			}
			if(smallestIndex != i)//swap
			{
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
				checks1++;
			}
			
		}
		System.out.println("The array has been sorted. The number of checks is " + checks1);
	}
	
	public static void bubbleSort(int[] b)
	{
		int[] a = new int[b.length];
		for(int x = 0; x < b.length; x++)
		{
			a[x] = b[x];
		}
		
		
		for(int x = 0; x < a.length - 1; x++)
		{
			if(a[x] < a[x + 1])
			{
				x++;
				checks2++;
			}
			else if(a[x] == a[x + 1])
			{
				x++;
				checks2++;
			}
			else
			{
				checks2++;
				int temp = a[x];
				a[x] = a[x + 1];
				a[x+1] = temp;
			}
		}
		System.out.println("The array has been sorted. The number of checks is " + checks2);
	}
	
	public static void mergeSort(int [] a)
	{
		if(checks3 == 0)
		{
			originalLen = a.length;
		}
		int size = a.length;
		if(size < 2) //recursive halt
		{
			return;
		}
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		for(int x = 0; x < mid; x++)//starts at beginning goes to middle
		{
			left[x] = a[x];
			checks3++;
		}
		for(int x = mid; x < size; x++)//starts at mid goes to end
		{
			right[x - mid] = a[x];
			checks3++;
		}
		mergeSort(left);
		mergeSort(right);
		// merge
		merge(left,right,a);
		if(a.length == originalLen)
			System.out.println("The array has been sorted. The number of checks is: " + checks3);
		
	}
	
	private static void merge(int[] left, int[] right, int[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//index of left array
		int j = 0;//index of right array
		int k = 0;//index of sorted array (a)
		
		while(i < leftSize && j < rightSize)//left array was smaller than right array
		{
			if(left[i] <= right[j])
			{
				checks3++;
				a[k] = left[i];
				i++;
				k++;
			}
			else//value in right was smaller than left
			{
				checks3++;
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < leftSize)//values still left in left side
		{
			checks3++;
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < rightSize)// values left in right side
		{
			checks3++;
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void quickSort(int[] a, int left, int right)
	{
		if(checks4 == 0)
		{
			originalLen = a.length;
		}
		
		if(left == right)
			System.out.println("Array has been sorted.  The number of checks is: " + checks4);
		//partition
		int index = partition(a,left,right);
		if(left < index - 1)
		{
			checks4++;
			quickSort(a,left,index -1);
		}
		if(index < right)
		{
			checks4++;
			quickSort(a,index + 1, right);
		}

		
	}
	
	private static int partition(int[] a, int left, int right)
	{
		int i = left;
		int j = right;
		
		int pivot = a[(left + right)/2];
		while(i <= j)
		{
			
			while(a[i] < pivot)
			{
				checks4++;
				i++;
			}
			while(a[j] > pivot)
			{
				checks4++;
				j--;
			}
			if(i <= j)//SWAP
			{
				checks4++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	public void getAverage()
	{
		System.out.println((checks1 + checks2 + checks3 + checks4)/4);
	}
	
	public void resetArray(int[] original, int[] sorted)
	{
		for(int x = 0; x < original.length; x++)
		{
			sorted[x] = original[x];
		}
	}
}
