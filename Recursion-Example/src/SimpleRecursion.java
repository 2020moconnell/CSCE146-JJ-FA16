import java.util.Scanner;
public class SimpleRecursion 
{
	public static void main(String[] args)
	{
		
	}
	
	public static int factorial(int number)
	{
		if(number == 0) //stopping condition
			return 1;
		else
			return number * factorial(number - 1); //recursive call
	}
	
	public static int gcd(int one, int two)
	{
		if(two == 0)
			return one;
		else
			return gcd(two, one % two);
	}
	
	public static int fibonacci(int number)
	{
		if(number == 1 || number == 2)
			return 1;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}
}
