
public class GenLinkedList <T>
{
	private class ListNode
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
	private ListNode head; //Points to the first element in Linked List
	private ListNode current; //Useful iterators
	private ListNode previous; //"..."
	public GenLinkedList()
	{
		head = current = previous = null;
	}
	public void addNodeToStart(T addData)
	{
		head = new ListNode(addData, head);
		current = head;
	}
	public void insertNodeAfterCurrent(T addData)
	{
		ListNode newNode = new ListNode();
		newNode.data = addData;
		
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
	public void printList()
	{
		ListNode tempNode = head;
		while(tempNode != null)
		{
			System.out.println(tempNode.data);
			tempNode = tempNode.link;
		}
	}
	public void deleteCurrentNode()
	{
		if((current != null) && (previous != null))
		{
			previous.link = current.link;
			current = current.link;
		}
		else if (current == head) //Removing first element in the list
		{
			head = current.link;
			current = head;
		}
		else
		{
			System.out.println("Trying to remove a non-existing element.");
		}
	}
}
