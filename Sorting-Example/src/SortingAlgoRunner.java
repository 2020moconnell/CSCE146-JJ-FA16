
public class SortingAlgoRunner 
{
	public static void main(String[] args)
	{
		int[] a = {9,2,8,3,7,4,6,5,5};
		
		
		SortingAlgo bubble = new SortingAlgo();
		//bubble.selectionSort(a);
		//bubble.bubbleSort(a);
		//bubble.quickSort(a, 0, a.length -1);
		bubble.mergeSort(a);
		for(int x = 0; x < a.length; x++)
		{
			System.out.println(a[x]);
		}
		
	}
}
