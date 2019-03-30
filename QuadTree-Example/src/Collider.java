
public class Collider 
{
	private double x;
	private double y;
	
	public Collider()
	{
		this.x = this.y = 0;
	}
	
	public Collider(double aX, double aY)
	{
		//Use mutators for error checking
		//No error checking here because all numbers are valid
		this.setX(aX);
		this.setY(aY);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String toString()
	{
		return this.x + " " + this.y;
	}
	
}
