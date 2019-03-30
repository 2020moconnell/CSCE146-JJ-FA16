import java.applet.*;
import java.awt.*;
import java.util.*;

public class SierpinskiTriangle extends Applet
{
	private Image display;
	private Graphics drawingArea;
	private int side;
	int height;
	int width;
	
	public void init()
	{
		height = getSize().height;
		width = getSize().width;
		this.resize(200, 200);
		display = createImage(width, height);
		drawingArea = display.getGraphics();
		int[] xVals = {width/2, 0, width};
		int[] yVals = {0, height, height};
		drawingArea.setColor(Color.RED);
		drawingArea.fillPolygon(xVals, yVals, 3);
		int[] xVals2 = {width/4, (width/4) * 3, width/2};
		int[] yVals2 = {height/2, height/2, height};
		drawingArea.setColor(Color.BLUE);
		drawingArea.fillPolygon(xVals2, yVals2, 3);
		drawGasket(width/4, 0, width/2);
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(display,  0,  0, null);
	}
	
	public void drawGasket(int x, int y, int side)
	{
		drawingArea.setColor(Color.GREEN);
		int sub = side/4;
		for (int z = 0; z<3; z++)
		{
			if (z ==0)
			{
				int[] xVals = {3 * sub, side, side + sub};
				int[] yVals = {side/2, side, side/2};
				drawingArea.fillPolygon(xVals, yVals, 3);
			}
			else if (z == 1)
			{
				int[] xVals = {sub, 2 * sub, 3 * sub};
				int[] yVals = {height - side/2, height, height - side/2};
				drawingArea.fillPolygon(xVals, yVals, 3);	
			}
			else
			{
				int[] xVals = {width - (3 * sub), 2 * sub + side, width - sub};
				int[] yVals = {height - side/2, height, height - side/2};
				drawingArea.fillPolygon(xVals, yVals, 3);
			}
			
		}
		/*if(sub >= 4)
		{
			//top
			drawGasket(3 * sub, side/2, side);
			
			//left
			drawGasket(sub, 2 * sub, side);
			
			//right
			drawGasket(width - (3 * sub), height - side/2, side);
		}*/
	}
		
}

