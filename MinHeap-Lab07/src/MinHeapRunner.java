

public class MinHeapRunner 
{
	public static void main (String[] args)
	{
		//new Heap
		MinHeap heap = new MinHeap();
		//inserting integers into heap
		/*heap.insert(21);
		heap.insert(37);
		heap.insert(49);
		heap.insert(11);
		heap.insert(23);
		heap.insert(1);
		heap.insert(13);
		heap.insert(16);
		heap.insert(33);
		heap.insert(17);*/
		

		heap.insert(21);
		heap.insert(27);
		heap.insert(49);
		heap.insert(11);
		heap.insert(23);
		heap.insert(1);
		heap.insert(13);
		heap.insert(16);
		heap.insert(33);
		heap.insert(17);
		
		//System.out.println("Printing the heap");
		//heap.printHeap();
		//System.out.println();
		//System.out.println("Testing heap Sort");
		//heap.heapSort();
		System.out.println("Removing an element from the heap. \nThe element removed is 1 and the heap now is: ");
		heap.remove();
		heap.remove();
		heap.printHeap();
	}
}
