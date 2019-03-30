public class Taco 
{
	private String name;
	private String maker;
	private double price;
	private int rating;
	
	public Taco()
	{
		name = null;
		maker = null;
		price = 0.0;
		rating = 0;
	}
	
	public Taco(String aName, String aMaker, double aPrice, int aRating)
	{
		//TODO
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) 
	{
		if(rating >= 0 && rating <= 4)
			this.rating = rating;
	}
	
	
}
