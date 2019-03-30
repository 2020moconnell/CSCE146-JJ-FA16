
public class Phobia 
{
	private String name;
	private String description;
	
	public Phobia()
	{
		name = null;
		description = null;
	}
	
	public Phobia(String aName, String aDescription)
	{
		name = aName;
		description = aDescription;
	}
	
	public String toString()
	{
		return name + " : " + description;
	}
	
	public boolean equals(Phobia aPhobia)
	{
		if(this.getName().equals(aPhobia.getName()) && this.getDescription().equals(aPhobia.getDescription()))
			return true;
		else 
			return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
