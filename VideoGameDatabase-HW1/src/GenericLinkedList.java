public class GenericLinkedList <T>
{
	public class ListNode
	{
		private T data;
		private ListNode link;
		public ListNode()
		{
			data = null;
			link = null;
		}
		
		public ListNode(T aData, ListNode aNode)
		{
			data = aData;
			link = aNode;
		}
	}
	
	public ListNode head; //points to the first item
	public ListNode current;
	private ListNode previous;
	
	public GenericLinkedList()
	{
		head = current = previous = null;
	}
	
	public T getDataAtCurrent() //Accessor
	{
		if(current != null)
			return current.data;
		else
			return null;
	}
	
	public void setDataAtCurrent(T aData)//Mutator
	{
		if(current != null)
			current.data = aData;
	}
	
	public void insert(T newData)// inserts at the end of the list
	{
		//Construct node
		ListNode newNode = new ListNode();
		newNode.data = newData;
		if(head == null) //checks if list is empty
		{
			head = newNode;
			current = head;
			return;
		}
		ListNode temp = head;
		while(temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	
	public void insertAfterCurrent(T newData)
	{
		ListNode newNode = new ListNode();
		newNode.data = newData;
		if(current != null)
		{
			newNode.link = current.link;
			current.link = newNode;
		}
	}
	
	//Iteration methods to move around the current
	public void resetIteration()
	{
		current = head;
		previous = null;
	}
	
	public boolean moreToIterate()
	{
		return current != null;
	}
	
	public void goToNext()
	{
		if(current != null)
		{
			previous = current;
			current = current.link;
		}
	}
	
	public void removeCurrent()
	{
		if(current != null && previous != null)//checks to make sure current is in the middle of the list
		{
			previous.link = current.link;
			current = current.link;
		}
		else if(current != null && previous == null)//current is the head
		{
			head = current.link; //or head = head.link  both are same thing
			current = head;
		}
		else
		{
			System.out.println("Deleting nothing.");
		}
	}
	
	public void showList()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	public void addGames(String name, String console)
	{
		ListNode newNode = new ListNode();
		VideoGame gam = new VideoGame(name, console);
		newNode.data = (T) gam;
		if(head == null) //checks if list is empty
		{
			head = newNode;
			current = head;
			return;
		}
		ListNode temp = head;
		while(temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	
	
	
	
}






