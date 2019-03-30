import java.util.*;
public class PhobiaHashTable 
{
	private ArrayList<Phobia>[] table;
	private static final int TABLE_SIZE = 26;
	
	public PhobiaHashTable()
	{
		table = new ArrayList[TABLE_SIZE];
		for(int i = 0; i < table.length;i++)
		{
			table[i] = new ArrayList<Phobia>();
		}
	}
	
	private int calcPhobiaIndex(Phobia aPhobia)
	{
		int index = 0;
		String nameAndDescription = aPhobia.getName() + aPhobia.getDescription();
		for(int i = 0; i < nameAndDescription.length(); i++)
		{
			index += nameAndDescription.charAt(i);
		}
		index %= TABLE_SIZE;
		return index;
	}
	
	public void add(Phobia aPhobia)
	{
		table[calcPhobiaIndex(aPhobia)].add(aPhobia);
	}
	
	public void remove(Phobia aPhobia)
	{
		int index = calcPhobiaIndex(aPhobia);
		if(table[index].contains(aPhobia))
			table[index].remove(aPhobia);
		else
			System.out.println("Phobia not found");
	}
	
	public void lookUp(Phobia aPhobia)
	{
		int index = calcPhobiaIndex(aPhobia);
		if(table[index].contains(aPhobia))
			System.out.println(aPhobia.toString());
		else
			System.out.println("Phobia not found");
	}
	
	public Phobia lookUp(String aName, String aDescription)
	{
		Phobia temp = new Phobia();
		for(int x = 0; x < TABLE_SIZE; x++)
		{
			for(int i = 0; i < table[x].size(); i++)
			{
				if(table[x].get(i).getName().equals(aName) && table[x].get(i).getDescription().equals(aDescription))
				{
					temp = table[x].get(i);
				}
			}
		}
		return temp;
	}
	
	public void printHashTable()
	{
		for(int x = 0; x < TABLE_SIZE; x++)
		{
			for(int i = 0; i < table[x].size(); i++)
			{
				System.out.println(table[x].get(i));
			}
		}
	}
}
