import java.applet.Applet;
import java.awt.Graphics;
public class OnePointThree extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawLine(65, 10, 65, 200);
		g.drawLine(135, 10, 135, 200);
		g.drawLine(10, 65, 200, 65);
		g.drawLine(10, 135, 200, 135);
		g.drawOval(0,67, 64, 64);
		g.drawLine(5, 5, 64, 64);
		g.drawLine(65, 5, 5, 65);
		g.drawLine(70, 5, 135, 65);
		g.drawLine(70, 65, 135, 5);
		g.drawOval(67, 67, 64, 64);
		g.drawLine(140, 5, 200, 65);
		g.drawLine(140, 65, 200, 5);
		g.drawLine(0 ,37 ,200 ,37 );
	}
}