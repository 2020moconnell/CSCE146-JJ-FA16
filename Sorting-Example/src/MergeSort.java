
public class MergeSort 
{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		for(int x =0; x <a.length; x++)
		{
			a[x] = (int) (Math.random() * 10);
		}
		mergeSort(a);
		for(int x = 0; x < a.length; x++)
		{
			System.out.println(a[x]);
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
		for(int x = mid; x < size; x++)//starts at mid goes to end
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
}
