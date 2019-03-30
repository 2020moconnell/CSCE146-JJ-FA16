
public class MinHeap
{
	public static final int DEFAULT_SIZE = 100;
	private int[] heap;
	private int size;
	
	public MinHeap()
	{
		heap = new int[DEFAULT_SIZE];
		size = 0;
	}
	
	public MinHeap(int aSize)
	{
		if(aSize <= 0)
			return;
		heap = new int[size];
		size = 0;
	}
	
	public void insert(int value)
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
		while(index > 0 && (heap[(index - 1)/2] > (heap[index])))
		{
			//SWAP
			int temp = heap[(index - 1)/2];//37
			heap[(index - 1)/2] = heap[index];
			heap[index] = temp;
			index = (index - 1)/2;
		}
	}
	
	public int remove()
	{
		int retVal = heap[0];
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
			int smallIndex = index * 2 + 1;
			if(index * 2 + 2 < size && heap[index * 2 + 1] > (heap[index * 2 + 2]))
			{
				smallIndex = index * 2 + 2;
			}
			
			if(heap[index] > (heap[smallIndex]))
			{
				//SWAP
				int temp = heap[index];
				heap[index] = heap[smallIndex];
				heap[smallIndex] = temp;
			}
			else
			{
				break; //We out!
			}
			index = smallIndex;
		}
	}
	
	public void heapSort()
	{
		//copying the array
		MinHeap copy = new MinHeap();
		for(int x = 0; x < size; x++)
		{
			copy.insert(heap[x]);
		}
		for(int x = size; x > 0; x--)
			System.out.println(copy.remove() + " ");
	}
	
	
	public void printHeap()
	{
		for(int x = 0; x < size; x++)
		{
			System.out.println(heap[x]);
		}
	}
}

