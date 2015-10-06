
import javax.swing.JOptionPane;


/*Allow me to introduce the winners of the tournoment
 * Blaze....Lazer.....Blazer....
 * And I believe you've met my fitness consigliare Michele
 */

public class threepointsix 
{

	public enum months
	{
	
		JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG//
		, SEP, OCT, NOV, DEC
	}

	public static void main(String args[])
	{
		boolean runLoop = true;
		
		while (runLoop == true)
		{
			months[] options = {months.JAN, months.FEB, months.MAR, months.APR, months.MAY, months.JUN, months.JUL, //
					months.AUG, months.SEP, months.OCT, months.NOV, months.DEC};
			months input = (months) JOptionPane.showInputDialog(null, "Select Month", "Month Select", //
					JOptionPane.INFORMATION_MESSAGE, null, options, options[11]);
			if (input == null)
			{
				System.exit(0);
			}
				switch (input)
				{
				case DEC:
				case JAN:
				case FEB:
					JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
					break;
				case MAR:
				case APR:
				case MAY:
					JOptionPane.showMessageDialog(null, "Happy Spring");
					break;
				case JUN:
				case JUL:
				case AUG:
					JOptionPane.showMessageDialog(null, "It's Summer time");
					break;
				case SEP:
				case OCT:
				case NOV:
					JOptionPane.showMessageDialog(null, "Welcome to foliage season");
					break;
				
				}
			}
		}
	
	
	

	}

	

		
	





