
public class SortingAlgo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		selectionSort(arr);
	}
	
	public static int[] selectionSort(int[] a)
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
	
	public static void bubbleSort(int[] a)
	{
		for(int x = 0; x < a.length - 1; x++)
		{
			if(a[x] < a[x + 1])
			{
				x++;
			}
			else if(a[x] == a[x + 1])
			{
				x++;
			}
			else
			{
				int temp = a[x];
				a[x] = a[x + 1];
				a[x+1] = temp;
			}
		}
	}
	
	public static void mergeSort(int[] a, int left, int right)
	{
		int mid;
		if(right > left)
		{
			mid = (right + left) / 2;
			mergeSort(a,left, mid);
			mergeSort(a, mid + 1, right);
			merge(a, left, mid + 1, right);
		}
	}
	
	public static void merge(int[] a, int left, int mid, int right)
	{
		int[] temp = new int[a.length];
		int leftEnd = mid -1;
		int tempPos = left;
		
		int numElements = right - left + 1;
		while ((left <= leftEnd) && (mid <= right))
		{
			if(a[left] <= a[mid])//adds the value at the left to the temp array
			{
				temp[tempPos++] = a[left++];
			}
			else//adds the value at the middle to the temp array
			{
				temp[tempPos] = a[mid++];
			}
		}
		while(left <= leftEnd)//left array is not complete
		{
			temp[tempPos++] = a[left++];
		}
		while(mid <= right)//right array is not complete
		{
			temp[tempPos++] = a[mid++];
			/*
			 * same as
			 * temp[tempPos] = a[mid];
			 * tempPos++;
			 * mid++;
			 */
		}
		for(int i = left; i <= right; i++)// fix up to sort array
		{
			a[i] = temp[i];
		}
	}
	
	public static void mergeSort(int [] a)
	{
		int size = a.length;
		if(size < 2) //recursive halt
			return;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		for(int x = 0; x < mid; x++)//starts at beginning goes to middle
		{
			left[x] = a[x];
		}
		for(int x = 0; x < size; x++)//starts at mid goes to end
		{
			right[x - mid] = a[x];
		}
		mergeSort(left);
		mergeSort(right);
		// merge
		merge(left,right,a);
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
				a[k] = left[i];
				i++;
				k++;
			}
			else//value in right was smaller than left
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < leftSize)//values still left in left side
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < rightSize)// values left in right side
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void quickSort(int[] a, int left, int right)
	{
		//partition
		int index = partition(a,left,right);
		if(left < index - 1)
			quickSort(a,left,index -1);
		if(index < right)
			quickSort(a,index, right);
		
	}
	
	private static int partition(int[] a, int left, int right)
	{
		int i = left;
		int j = right;
		int pivot = a[(left + right)/2];
		while(i <= j)
		{
			while(a[i] < pivot)
				i++;
			while(a[j] > pivot)
				j--;
			if(i <= j)//SWAP
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
}
