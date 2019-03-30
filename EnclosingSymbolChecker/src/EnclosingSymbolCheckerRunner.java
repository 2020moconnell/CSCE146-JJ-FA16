
public class EnclosingSymbolCheckerRunner 
{
	public static void main(String[] args)
	{
		EnclosingSymbolChecker checker = new EnclosingSymbolChecker("()");
		checker.checkForSymbol();
		EnclosingSymbolChecker checker1 = new EnclosingSymbolChecker("<<<>>>");
		checker1.checkForSymbol();
		EnclosingSymbolChecker checker2 = new EnclosingSymbolChecker("{(\"tacos\")}");
		checker2.checkForSymbol();
		EnclosingSymbolChecker checker3 = new EnclosingSymbolChecker("if(pass == true) {return \"yay!\";}");
		checker3.checkForSymbol();
		EnclosingSymbolChecker checker4 = new EnclosingSymbolChecker("abcd");
		checker4.checkForSymbol();
		//EnclosingSymbolChecker checker5 = new EnclosingSymbolChecker("\"\"\"\"");
		//checker5.checkForSymbol();
		EnclosingSymbolChecker checker6 = new EnclosingSymbolChecker("<(\")");
		checker6.checkForSymbol();
		//EnclosingSymbolChecker checker7 = new EnclosingSymbolChecker(":-)");
		//checker7.checkForSymbol();
		EnclosingSymbolChecker checker8 = new EnclosingSymbolChecker("<3");
		checker8.checkForSymbol();
		EnclosingSymbolChecker checker9 = new EnclosingSymbolChecker("(<{\"\"}>");
		checker9.checkForSymbol();
	}
}
