import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args)
	{
		System.out.println("Please enter a word. Enter 'q' to quit.");
		Scanner scan = new Scanner(System.in);
		String words = scan.nextLine();
		Palindrome drome = new Palindrome(words);
		drome.isPalindrome(0, words.length()-1);
		while(!words.equalsIgnoreCase("q"))
		{
			System.out.println();
			System.out.println("Would you like to enter another word? Enter here or 'q' to quit.");
			Scanner scan1 = new Scanner(System.in);
			String words1 = scan.nextLine();
			Palindrome drome1 = new Palindrome(words1);
			drome1.isPalindrome(0, words.length()-1);
		}
	}
}

