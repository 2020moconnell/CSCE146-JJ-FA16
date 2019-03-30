
public class TacoManager 
{
	private GenLinkedList<Taco> tacos;
	private static final String DELIM = "/t";
	
	public TacoManager()
	{
		tacos = new GenLinkedList<Taco>();
	}
	
	public void addTaco(Taco aTaco)
	{
		tacos.insert(aTaco);
	}
	
	public void removeTaco(Taco aTaco)
	{
		tacos.resetIteration();
		while(tacos.moreToIterate())
		{
			if(tacos.getDataAtCurrent().equals(aTaco))
			{
				tacos.removeCurrent();
				break;
			}
			tacos.goToNext();
		}
	}
}

