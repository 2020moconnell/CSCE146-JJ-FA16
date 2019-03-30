public class VideoGame 
{
	public String name;
	public String console;
	
	public VideoGame()
	{
		name = null;
		console = null;
	}
	
	public VideoGame(String nam, String con)
	{
		name = nam;
		console = con;
	}
	
	public void setName(String nam)
	{
		name = nam;
	}
	
	public void setConsole(String con)
	{
		console = con;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getConsole()
	{
		return console;
	}
}
