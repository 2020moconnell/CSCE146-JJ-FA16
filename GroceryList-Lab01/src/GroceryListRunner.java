
public class GroceryListRunner 
{
	public static void main (String[] args)
	{
		GroceryList list = new GroceryList();
		list.addItem(new GroceryItem("Taco Shells", 2.0));
		list.addItem(new GroceryItem("Salsa", 1.59));
		list.addItem(new GroceryItem("Chips", 1.29));
		list.addItem(new GroceryItem("Ground Beef", 4.59));
		list.addItem(new GroceryItem("Shredded Cheese", 2.99));	
		list.showList();
		list.goToNext();
		list.goToNext();
		list.addItem(new GroceryItem("Heart Burn Medicine", 5.99));
		list.addItem(new GroceryItem("Banana", .99));
		list.deleteCurrentNode();
		list.contains("Salsa", 2.0);
		list.totalCost();
	}
	
}
