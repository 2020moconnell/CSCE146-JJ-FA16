
public class GroceryItem 
{
	public String name;
	public double value;
	
	public GroceryItem()
	{
		name = null;
		value = 0;
	}
	
	public GroceryItem(String aName, double aValue)
	{
		name = aName;
		value = aValue;
	}
	
	public void setItem(GroceryItem item)
	{
		name = item.getName();
		value = item.getValue();
	}
	
	public void setName(String aName)
	{
		name = aName;
	}
	
	public String getName()
	{
		return "Name of product is: " + name;
	}
	
	public void setValue(double aValue)
	{
		if (aValue < 0)
		{
			value = value;
		}
		else
		{
			value = aValue;
		}
	}
	
	public double getValue()
	{
		return value;
	}
	
	public String toString()
	{
		return "Name: " + name + ", Value: " + value;
	}
	
	public Boolean equals(GroceryItem item)
	{
		if(item.getName().equals(this.getName()))
		{
			if (item.getValue() == (this.getValue()))
			{
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
}
