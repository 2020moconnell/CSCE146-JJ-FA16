import java.applet.*;
import java.awt.*;
import java.util.*;

public class SierpenskiSponge extends Applet
{
	private Image display;
	private Graphics drawingArea;
	
	public void init()
	{
		int height = getSize().height;
		int width = getSize().width;
		display = createImage(width, height);
		drawingArea = display.getGraphics();
		//draw sponge
		drawGasket(0, 0, height, drawingArea);
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(display,  0,  0, null);
	}
	
	public static void drawGasket(int x, int y, int side, Graphics g)
	{
		int sub = side/3;
		g.fillRect(x + sub, y + sub, sub, sub);
		//g.fillPolygon(array of x points, array of y points, nPoints *3*) use to fill triangle
		//g.setColor(Color.green)
		//Draw first triangle of certain color
		//draw first upright triangle
		//^put those in the init
		//change color then draw upside down triangles recursively
		if(sub >= 3)
		{
			//top squares
			drawGasket(x, y, sub, g); //left
			drawGasket(x + sub, y, sub, g); // middle
			drawGasket(x + sub*2, y, sub, g); //right
			
			//middle squares
			drawGasket(x, y + sub, sub, g); //left
			drawGasket(x + sub*2, y + sub, sub, g); //right
			
			//bottom squares
			drawGasket(x, y+ sub*2, sub, g); //left
			drawGasket(x + sub, y + sub*2, sub, g); //top middle
			drawGasket(x + sub*2, y + sub*2, sub, g); //right
		}
	}
}
