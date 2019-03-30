
public class QueueTester 
{
	public static void main(String[] args)
	{
		QueueInterface<Integer> queue = new ArrayQueue<Integer>();
		
		for(int i = 0; i < 10 ; i++)
		{
			queue.enqueue(i);
		}
		queue.print();
		
		//OR
		
		QueueInterface<Integer> queue1 = new LinkedListQueue<Integer>();
		
		for(int i = 0; i < 10 ; i++)
		{
			queue1.enqueue(i);
		}
		queue1.print();
	}
}
