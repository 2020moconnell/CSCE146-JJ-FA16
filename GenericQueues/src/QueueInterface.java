
public interface QueueInterface<T> 
{
	public T peek();
	public T dequeue();
	public void enqueue(T data);
	public void print();
}
