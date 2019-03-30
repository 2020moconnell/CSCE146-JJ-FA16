
public class Fruit implements Comparable
{
	private String name;
	private double weight;
	
	public Fruit(String aName, double aWeight)
	{
		this.setName(aName);
		this.setWeight(aWeight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString()
	{
		return this.name + " " + this.weight;
	}
	
	public int compareTo(Object obj)
	{
		Fruit aFruit = (Fruit) obj;
		if(this.weight < aFruit.getWeight())
			return -1;
		if(this.weight > aFruit.getWeight())
			return 1;
		else
			return 0;
	}
}
