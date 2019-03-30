
public class TacoTester 
{
	public static void main(String[] args)
	{
		LinkedBSTree<TacoClass> tacoTree = new LinkedBSTree<TacoClass>(); //Use commented one in LInkedBSTree
		
		tacoTree.insert(new TacoClass("Grande", 1.99));
		tacoTree.insert(new TacoClass("blah", 8.99));
		tacoTree.printInOrder();
	}
}

