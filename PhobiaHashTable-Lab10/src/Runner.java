import java.util.Scanner;

public class Runner 
{
	public static void main(String[] args)
	{
		String name, description;
		PhobiaHashTable hash = new PhobiaHashTable();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter:");
		System.out.println("1: Add a phobia");
		System.out.println("2: Remove a phobia");
		System.out.println("3: Look Up a phobia");
		System.out.println("4: Print all phobias");
		System.out.println("5: Quit");
		while(scan.hasNext())
		{
			int number = scan.nextInt();
			if(number == 1)
			{
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Please enter the name of a phobia.");
				name = scan1.nextLine();
				System.out.println("Please enter a description.");
				description = scan1.nextLine();
				hash.add(new Phobia(name,description));
				System.out.println("Phobia added");
			}
			else if(number == 2)
			{
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Please enter the name of a phobia.");
				name = scan2.nextLine();
				System.out.println("Please enter a description.");
				description = scan2.nextLine();
				hash.remove(hash.lookUp(name, description));
				System.out.println("Phobia removed");
			}
			else if(number == 3)
			{
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Please enter the name of a phobia.");
				name = scan3.nextLine();
				System.out.println("Please enter a description.");
				description = scan3.nextLine();
				hash.lookUp(name, description);
			}
			else if(number == 4)
			{
				System.out.println("Phobias printing");
				hash.printHashTable();
				
			}
			else if(number == 5)
			{
				System.out.println("Goodbye phobias");
			}
			else
			{
				System.out.println("Please enter a valid number. Valid numbers include 1-5");
			}
			if(number != 5)
			{
				System.out.println("Enter:");
				System.out.println("1: Add a phobia");
				System.out.println("2: Remove a phobia");
				System.out.println("3: Look Up a phobia");
				System.out.println("4: Print all phobias");
				System.out.println("5: Quit");
			}
		}
	}
}
