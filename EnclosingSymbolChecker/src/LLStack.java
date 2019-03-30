
public class LLStack <String> implements StackInterface
{
	public class ListNode
	{
		public String data;
		public ListNode link;
		
		public ListNode(String aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
		
		public ListNode head;
		public LLStack()
		{
			head = null;
		}
		
		public void push(Object aData)
		{
			ListNode newNode = new ListNode((String) aData, head);
			head = newNode;
		}
		
		public String pop()
		{
			if(head == null)
				return null;
			String retData = head.data;
			head = head.link;
			return retData;
		}
		
		public boolean peek()
		{
			if(head == null)
				return true;
			return false;
		}
		
		public void print()
		{
			ListNode temp = head;
			while(temp != null)
			{
				
				System.out.println(temp.data.toString());
				temp = temp.link;
			}
		}
		
		public String getHead()
		{
			return head.data;
		}
}
