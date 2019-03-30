/*
 * Maggie O'Connell
 * Lab 06
 * 9/30
 */
import java.util.*;
public class dataStructureRunner 
{
	public static void main (String[] args)
	{
		//fills the arrayList
		for(int y = 0; y < 3; y++)
		{

			ArrayList<Integer> list =  new ArrayList<Integer>();
			dataStructure data = new dataStructure();
			for(int x = 0; x < (int)(Math.random() * 10 + 10); x++)
			{
				list.add(x, ((int)(Math.random() * 99)));
			}
			
			
			int[] array = new int[list.size()];
			array = dataStructure.toArray(list);
			System.out.println("Original Array");
			dataStructure.print(array);
			System.out.println("Sorted Array");
			dataStructure.mergeSort(array);
			dataStructure.print(array);
			System.out.println("Enqueueing all items");
			Queue<Integer> q = new LinkedList<Integer>();
			for(int x = 0; x < array.length; x++)
			{
				q.add(array[x]);
			}
			System.out.println("Dequeueing all items and printing dequeued items");
			for(int x = 0; x < array.length; x++)
			{
				System.out.println(q.remove());
			}
			System.out.println("Adding items to stack");
			Deque<Integer> stack = new ArrayDeque<Integer>();
			for(int x = 0; x < array.length; x++)
			{
				stack.push(array[x]);
			}
			System.out.println("Popping all items from stack and printing popped items");
			for(int x = 0; x < array.length; x++)
			{
				System.out.println(stack.pop());
			}
		}
	}
}
