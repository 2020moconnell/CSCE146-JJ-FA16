
public class SortingAlgoRunner 
{
	private static int[] array = new int[1000];
	private static int[] array2 = new int[1000];
	public static void main (String[] args)
	{
		 
		for (int x = 0; x < 1000; x++)
		{
			array[x] = ((int) (Math.random() * 1000));
			array2[x] = array[x];
		}
		SortingAlgos nowSort = new SortingAlgos();
		System.out.println("Section Sort");
		nowSort.selectionSort(array2);
		nowSort.resetArray(array, array2);
		System.out.println("Bubble Sort");
		nowSort.bubbleSort(array);
		nowSort.resetArray(array, array2);
		System.out.println("Merge Sort");
		nowSort.mergeSort(array);
		nowSort.resetArray(array, array2);
		System.out.println("Quick Sort");
		nowSort.quickSort(array, 0, array.length-1);
		System.out.println("The average number of checks is:");
		nowSort.getAverage();
	}
}
