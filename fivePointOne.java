import javax.swing.JOptionPane;
public class fivePointOne 
{
	public static void main(String args[])
	{
		powers();
		absoluteValue();
		squareRoot();
	}

	private static void absoluteValue() 
	{
		int y = 0;
		int x = 0;
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
		
		if (x < 0)
		{
			y = x * -1;
		}
		else
		{
			y = x
		}
		JOptionPane.showMessageDialog(null, "Absolute value of " + x + " is: " + y);
	}

	private static void squareRoot() 
	{
		int x = 0;
		double sqrt = 0.0;
		double t = 0.0;
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
		sqrt = x / 2;
		
		do
		{
			t = sqrt;
			sqrt = (t + (x / t)) / 2;
		}while ((t-sqrt) != 0);
		JOptionPane.showMessageDialog(null, "Square root of " + x + " is " + sqrt);
	}

	private static void powers() 
	{
		int x = 0;
		int y = 0;
		int z = 1;	
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
		y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an exponent"));
		
		for(int t=1; y>0; y--)
		{
			z = z * x;
		}
		JOptionPane.showMessageDialog(null, z);
	}
	
}
