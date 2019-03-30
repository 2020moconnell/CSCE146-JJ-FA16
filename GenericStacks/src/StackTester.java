
public class StackTester 
{
	public static void main(String[] args)
	{
		StackInterface<Integer> stack = new ArrayStack<Integer>();
		for(int x = 0; x < 10; x++)
		{
			stack.push(x);
		}
		for(int x = 0; x < 10; x++)
		{
			System.out.println(stack.pop());
		}
	}
}
