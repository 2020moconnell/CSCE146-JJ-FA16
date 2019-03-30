public class GroceryList 
{
	private class ListNode
	{
		public GroceryItem data;
		public ListNode link;
		
		public ListNode()
		{
			data = null;
			link = null;
		}
		
		public ListNode(GroceryItem aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	public ListNode head;
	public ListNode current;
	public ListNode previous;
	int count = 0;
	
	public GroceryList()
	{
		head = current = previous = null;
	}
	
	public void goToNext()
	{
		if (current.link != null)
		{
			previous = previous.link;
			current = current.link;
		}
		else
			current = current;
	}
	
	public GroceryItem getDataAtCurrent()
	{
		return current.data;
	}
	
	public void setDataAtCurrent(GroceryItem item)
	{
		current.data = item;
	}
	
	public void addItem(GroceryItem item)
	{
		if(head == null)
		{
			ListNode node = new ListNode(item, null);
			head = node;
			current = node;
			previous = node;
			head.data.setItem(item);
		}
		else
		{
			ListNode node = new ListNode(item, null);
			ListNode x = head;
			while ( x.link != null)
			{
				x = x.link;
			}
			x.link = node;
			node.data.setItem(item);
		}
	}
	
	public void insertAfterCurrent(GroceryItem item)
	{
		ListNode newNode = new ListNode();
		newNode.data = item;
		
		if(current != null)
		{
			newNode.link = current.link;
			current.link = newNode;
		}
		else if (head != null)
		{
			System.out.println("Current is outside of the list");
		}
		else
		{
			System.out.println("Tried to add to an empty list");
		}
	}
	
	public void deleteCurrentNode()
	{
		if((current != null) && (previous != null))
		{
			previous.link = current.link;
			current = current.link;
		}
		else if (current == head)
		{
			head = current.link;
			current = head;
		}
		else
		{
			System.out.println("Trying to remove a non-existing element.");
		}
	}
	
	public void showList()
	{
		ListNode x = head;
		while (x != null)
		{
			{

				System.out.println(x.data.toString());
				x = x.link;
			}
		}
		
	}
	
	
	public Boolean contains(GroceryItem item)
	{
		if (head == null)
		{
			return false;
		}
		else
		{
			for (current = head; current.link != null; current = current.link)
			{
				if(item.equals(current.data))
					return true;
				else
					return false;
			}
		}
		return false;
		
		
	}
	
	public double totalCost()
	{
		double val = 0;
		for (current = head; current.link != null; current = current.link)
		{
			val += current.data.getValue();
		}
		return val;
	}
}
