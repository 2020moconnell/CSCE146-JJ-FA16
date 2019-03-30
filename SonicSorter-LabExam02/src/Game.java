//Maggie O'Connell
public class Game 
{
	private String name;
	private int year;
	private String console;
	
	public Game(int aYear, String aName, String aConsole)
	{
		year = aYear;
		name = aName;
		console = aConsole;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
}
