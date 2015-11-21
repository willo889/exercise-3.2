import javax.swing.JOptionPane;
public class fivePointOneEasyPart 
{	public static void main(String args[])
	{
	double y = 0;
	double x = 0;
	double z = 0;
	
	x = Math.pow(8, 3);
	y = Math.abs(-800);
	z = Math.sqrt(47);
	
	JOptionPane.showMessageDialog(null, "Exponents : " + x + "\n"
			+ "Absolute Value : " + y + "\n"
			+ "Square Root : " + z);
	}
}
