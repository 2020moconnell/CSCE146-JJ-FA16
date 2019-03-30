/*
 * Maggie O'Connell
 * Lab 05
 */
import java.util.ArrayList;

public class BortSort 
{
	private String[] words;
	private ArrayList<Integer> nums = new ArrayList<Integer>();
	private int[] nums2;
	private String[] rightString;
	private String[] leftString;
	
	public BortSort(String[] aWords)
	{
		words = new String[aWords.length];
		for(int x = 0; x < aWords.length; x++)
		{
			words[x] = aWords[x];
		}
	}
	
	public int[] countBort()
	{
		int num = 0;
		int[] arr = new int[words.length];
		for(int x = 0; x < words.length; x++)
		{
			int position = words[x].indexOf("bort");
			if(position == -1)
			{
				position = 0;
			}
			while(position >= 0)
			{
				position++;
				num++;
				position = words[x].indexOf("bort", position);
				if(position == -1)
				{
					nums.add(num);
					position = 0;
				}
			}
			
		}
		for(int x = 0; x < words.length; x++)
		{
			arr[x] = nums.get(x);
		}
		return arr;
	}
	
	public void mergeSort(int [] a)
	{
		for(int x = 0; x < nums.size(); x++)
		{
			nums2 = new int[nums.size()];
			nums2[x] = nums.get(x);
		}
		
		int size = a.length;
		if(size < 2) //recursive halt
		{
			return;
		}
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		int[] leftNums = new int[leftSize];
		int[] rightNums = new int[rightSize];
		leftString = new String[leftSize];
		rightString = new String[rightSize];
		for(int x = 0; x < mid; x++)//starts at beginning goes to middle
		{
			leftNums[x] = a[x];
			leftString[x] = words[x];
		}
		for(int x = mid; x < size; x++)//starts at mid goes to end
		{
			rightNums[x - mid] = a[x];
			rightString[x - mid] = words[x];
		}
		mergeSort(leftNums);
		mergeSort(rightNums);
		// merge
		merge(leftNums,rightNums,a);
		
	}
	
	private void merge(int[] left, int[] right, int[] a)
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
				words[k] = leftString[i];
				i++;
				k++;
			}
			else//value in right was smaller than left
			{
				a[k] = right[j];
				words[k] = rightString[j];
				j++;
				k++;
			}
		}
		while(i < leftSize)//values still left in left side
		{
			a[k] = left[i];
			words[k] = leftString[i];
			i++;
			k++;
		}
		while(j < rightSize)// values left in right side
		{
			a[k] = right[j];
			words[k] = rightString[j];
			j++;
			k++;
		}
	}
	
	public void print(String[] aWords)
	{
		for(int x = 0; x < words.length; x++)
		{
			System.out.println(words[x]);
		}
	}
}
