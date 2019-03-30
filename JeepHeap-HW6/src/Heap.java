
public class Heap <Jeep extends Comparable>
{
	public static final int DEFAULT_SIZE = 100;
	private Jeep[] heap;
	private int size;
	
	public Heap()
	{
		heap = (Jeep[]) (new Comparable[DEFAULT_SIZE]);
		size = 0;
	}
	
	public void addJeep (Jeep ajeep)
	{
		if(size >= heap.length) //heap is full
			return;
		heap[size] =  ajeep;
		//bubble up
		driveUp();
		size++;
	}
	private void driveUp()
	{
		int index = this.size;
		while(index > 0 && heap[(index - 1)/2].compareTo(heap[index]) < 0)
		{
			//SWAP
			Jeep temp = heap[(index - 1)/2];
			heap[(index - 1)/2] = heap[index];
			heap[index] = temp;
			index = (index - 1)/2;
		}
	}
	
	public Jeep removeJeep()
	{
		Jeep retVal = heap[0];
		heap[0] = heap[size - 1];
		size--;
		// bubble down
		driveDown();
		return retVal;
	}
	private void driveDown()
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
				Jeep temp = heap[index];
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
	
	public void jeepRollCall()
	{
		for(int x = 0; x < size; x++)
		{
			System.out.println(heap[x].toString());
		}
	}
	
	public void jeepHeapSort()
	{
		Heap copy = new Heap();
		for(int x = 0; x < size; x++)
		{
			copy.addJeep(heap[x]);
		}
		for(int x = size; x > 0; x--)
		{
			System.out.println(this.removeJeep() + " ");
		}
	}

}
