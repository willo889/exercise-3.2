import javax.swing.JOptionPane;
public class threefive 
/*
 * Hi, this is my code
 * I am writing this so you understand my code
 * So strap in for this wild ride
 * 
 * Now, the program runs in a while loop
 * And it runs until the userSelection equals 6
 * My code does this because I am lazy and don't want to run it 100000 times
 * Even though thats not a big deal, but I digress
 * 
 * I now will explain the rest of the code
 * So, after it asks for input, it checks to see if its between in 1 and 5
 * 
 * Just so we understand each other, this is so invalid inputs always go to equal 6
 * On things that are invalid inputs the program stops running
 * However, that will not happen if your input is valid
 * Now, onto the switch/case scenario
 * 
 * Case 1-6 run all the options
 * Entering a valid input changes userRole to the appropriate setting
 * Now this program runs over and over again
 * And you should now read the first letter of each line
 */
{
	public static void main(String args[])
	{
		int userSelection = 0;
		String userRole = "";
		
		
		while(userSelection != 6)//Out of coffee beans?!?  GET TO THE JAVA!!!
		{
			userSelection = Integer.parseInt( JOptionPane.showInputDialog("1)Admin, 2)Faculty, 3)Staff, 4)Student, 5)Guest"));
			if (userSelection < 1 || userSelection > 5)
			{
				userSelection = 6;
			}
				switch (userSelection)
				{
					case 1:
						userRole = "Admin";
						JOptionPane.showMessageDialog(null,"Welcome " + userRole);//Say something in moonspeak!!!
						break;
					case 2: 
						userRole = "Faculty";
						JOptionPane.showMessageDialog(null,"Welcome " + userRole);
						break;
					case 3: 
						userRole = "Staff";
						JOptionPane.showMessageDialog(null,"Welcome " + userRole);
						break;
					case 4: 
						userRole = "Student";
						JOptionPane.showMessageDialog(null,"Welcome " + userRole);
						break;
					case 5: 
						userRole = "Guest";
						JOptionPane.showMessageDialog(null,"Welcome " + userRole);
						break;
					case 6: 
						userRole = "Invalid";
						JOptionPane.showMessageDialog(null,"Invalid Input", "Warning!!", JOptionPane.WARNING_MESSAGE);
						break;
					//Say "Beer Can" with a British accent.Congratz, i just taught you how to say "Bacon" with a Jamacian accent.
				}
				

		}
	}
}