
public class EnclosingSymbolChecker 
{
	private String word;
	private LLStack stack = new LLStack();
	
	public EnclosingSymbolChecker(String aWord)
	{
		word = aWord;
	}
	
	public boolean checkForSymbol()
	{
		for(int x = 0; x < word.length(); x++)
		{
			if(word.substring(x,x + 1).equals("{"))
				stack.push("{");
			if(word.substring(x,x + 1).equals("("))
				stack.push("(");
			if(word.substring(x,x + 1).equals("<"))
				stack.push("<");
		
			
			if(word.substring(x,x + 1).equals("\""))
			{
				if(stack.getHead() == null)
					stack.push("\"");
				if(stack.getHead().equals("\""))
					stack.pop();
				else
					stack.push("\"");
			}
			
			
			
			if(word.substring(x,x + 1).equals("}"))
			{
				if(stack.getHead().equals("{"))
					stack.pop();
			}
			if(word.substring(x,x + 1).equals(")"))
			{
				if(stack.getHead().equals("("))
					stack.pop();
				else
					stack.push(")");
			}
			if(word.substring(x,x + 1).equals(">"))
			{
				if(stack.getHead().equals("<"))
					stack.pop();
			}
			
		}
		if(stack.peek() == true)
		{
			System.out.println("true");
			return true;
		}
		else
		{
			System.out.println("False");
			return false;
		}
	}
	
}
