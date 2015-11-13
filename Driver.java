import javax.swing.JOptionPane;
public class Driver 
{
	public static void main(String args[])
	{
		int theSum = Calculator.getSum();
		double theAverage = Calculator.getAvg();
		int theProduct = Calculator.getPro();
		
		int factorial = Integer.parseInt(JOptionPane.showInputDialog("Enter number for factorial"));
		int theFact = Calculator.getFact(factorial);
		
		JOptionPane.showMessageDialog(null, "Sum : " + theSum + "\n"
				+ "Average : " + theAverage + "\n"
				+ "Product : " + theProduct + "\n"
				+ "Factorial : " + theFact);
	}
}
