import javax.swing.JOptionPane;
public class TwoPointThree 
{
	public static void main(String args[])
	{
	double centi= 0.0;
	int feet = 0;
	int inches = 0;
	centi = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter height in centimeters"));
	
	double convert = centi * 0.39;
	feet = (int) convert /12;
	inches = (int) (convert % 12);
	
	JOptionPane.showMessageDialog(null, "Height: " + feet + " feet" + inches + " inches");
	}
}
