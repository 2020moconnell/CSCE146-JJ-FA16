
public class TacoClass implements Comparable
{
	private String name;
	private double price;
	
	public TacoClass(String aName, double aPrice)
	{
		this.setName(aName);
		this.setPrice(aPrice);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		if(price >= 0.0)
			this.price = price;
	}
	
	public String toString()
	{
		return this.name + " " + this.price;
	}
	
	public int compareTo(Object obj)//avoid directly comparing doubles because of round off errors
	{
		TacoClass aTaco = (TacoClass) obj;
		if(this.price < aTaco.getPrice())
			return -1;
		if(this.price > aTaco.getPrice())
			return 1;
		else
			return 0;
	}
	
}
