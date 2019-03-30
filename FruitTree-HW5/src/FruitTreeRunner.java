import java.io.*;
import java.util.Scanner;

public class FruitTreeRunner 
{
	public static void main(String[] args)
	{

		LinkedBSTree<Fruit> fruitTree = new LinkedBSTree<Fruit>();
	
		try
		{
	        System.out.print("Enter a file name");
			Scanner scan = new Scanner(System.in).useDelimiter("\t");
	        File file = new File(scan.nextLine());

	        scan = new Scanner(file);
	        
			while(scan.hasNextLine())
			{
				fruitTree.insert(new Fruit(scan.next(), scan.nextInt()));
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Unable to open file");
		}

		System.out.println("Fruit Tree printed pre-order");
		fruitTree.printPreOrder();
		System.out.println();
		System.out.println("Fruit Tree printed in-order");
		fruitTree.printInOrder();
		System.out.println();
		System.out.println("Fruit Tree printed post-order");
		fruitTree.printPostOrder();
		
		
		
	}
}
