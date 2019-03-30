
public class Palindrome 
{
	private String word;
	private String orginal;
	String noSpaces = "";
	
	public Palindrome()
	{
		word = null;
		orginal = word;
	}
	
	public Palindrome(String theWord)
	{
		word = theWord.toLowerCase();
		orginal = word;
		
		for(int x = 0; x < orginal.length(); x++)
		{
			if(orginal.charAt(x) != ' ')
				noSpaces += orginal.charAt(x);
		}
	}
	
	public void isPalindrome(int indexA, int indexB)
	{
		
		if(indexA > indexB)
			System.out.println("Invalid index values.  Please enter 0 first then the length of your word -1.");
		
		char compare1 = noSpaces.charAt(0); //substring starting from beginning
		char compare2 = noSpaces.charAt(noSpaces.length()-1); //substring starting from end
		
		int index1 = indexA; //index of compare1
		int index2 = noSpaces.length() -1; //index of compare2
		
		if (noSpaces.length() == 1)
			System.out.println(orginal + " is a palindrome!");
		else if (noSpaces.length() == 2)
		{

			if (((index2 - 1) == index1) && compare1 == compare2) //stopper
				System.out.println(orginal + " is a palindrome!");
			else
				System.out.println(orginal + " is not a palindrome.");
		}
		else if ((noSpaces.length() == 3) && (noSpaces.charAt(0) == noSpaces.charAt(2)))
		{
			System.out.println(orginal + " is a palindrome!");
		}
		else if (compare1 == compare2)
		{
			noSpaces = noSpaces.substring(1, noSpaces.length()-1);
			isPalindrome(0, noSpaces.length()-1);
		}
		else
			System.out.println( orginal + " is not a palindrome.");
	}
	
}
