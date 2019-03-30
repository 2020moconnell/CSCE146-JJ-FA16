
public class ArrayHeap <T extends Comparable>
{
	public static final int DEFAULT_SIZE = 100;
	private T[] heap;
	private int size;
	
	public ArrayHeap()
	{
		heap = (T[]) (new Comparable[DEFAULT_SIZE]);
		size = 0;
	}
	
	public ArrayHeap(int aSize)
	{
		if(aSize <= 0)
			return;
		heap = (T[])(new Comparable[size]);
		size = 0; //use this.size if parameter was also called size
	}
	
	public void insert(T value)
	{
		if(size >= heap.length) //heap is full
			return;
		heap[size] = value;
		//bubble up
		bubbleUp();
		size++;
	}
	private void bubbleUp()
	{
		int index = this.size;
		while(index > 0 && heap[(index - 1)/2].compareTo(heap[index]) < 0)
		{
			//SWAP
			T temp = heap[(index - 1)/2];
			heap[(index - 1)/2] = heap[index];
			heap[index] = temp;
			index = (index - 1)/2;
		}
	}
	
	public T remove()
	{
		T retVal = heap[0];
		heap[0] = heap[size - 1];
		size--;
		// bubble down
		bubbleDown();
		return retVal;
	}
	private void bubbleDown()
	{
		int index = 0;
		while(index * 2 + 1 < size)
		{
			int bigIndex = index * 2 + 1;
			if(index * 2 + 2 < size && heap[index * 2 + 1].compareTo(heap[index * 2 + 2]) < 0)
			{
				bigIndex = index * 2 + 2;
			}
			
			if(heap[index].compareTo(heap[bigIndex])< 0)
			{
				//SWAP
				T temp = heap[index];
				heap[index] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
			{
				break; //We out!
			}
			index = bigIndex;
		}
	}
	
	public void heapSort()
	{
		//THIS DOES NOT PRESERVE THE HEAP! THE HEAP HAS BEEN COMPROMISED!
		for(int x = size; x > 0; x--)
			System.out.println(this.remove() + " ");
	}
}
