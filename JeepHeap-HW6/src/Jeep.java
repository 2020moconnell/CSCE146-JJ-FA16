

public class Jeep implements Comparable
{
	private int hp;
	private int weight;
	private String name;
	
	public Jeep()
	{
		hp = 0;
		weight = 0;
		name = null;
	}
	
	public Jeep(int aHP, int aWeight, String aName)
	{
		hp = aHP;
		weight = aWeight;
		name = aName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Object obj)
	{
		Jeep aJeep = (Jeep) obj;
		if(this.getHp() < aJeep.getHp())
			return -1;
		if(this.getHp() > aJeep.getHp())
			return 1;
		else
			return 0;
		
	}
	
	public String toString()
	{
		return "HP: " + this.getHp() + " Weight: " + this.getWeight() + " Name: " + this.getName();
	}
	
}
