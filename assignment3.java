import javax.swing.JOptionPane;
public class assignment3
{

	public static void main(String[] args)
	{
		int trial = 0;
		int limit = 3;
		int index = 0;
		String[] userData = { "Will", "Oliver", "Barry" };
		String[] passData = { "Spooky", "Arrow", "Flash" };//these are the arrays
		String[] accData = { "Admin", "Student", "Staff" };
		String userIn = "";
		String passIn = "";
		boolean Auth = false;
		boolean userBool = false;//the booleans i use
		boolean passBool = false;
		
			while (Auth == false)
			{

				index = 0;
				if (trial > limit)
				{
					JOptionPane.showMessageDialog(null,  "Locked Out, Contact Admin", "Warning", JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}
				if (trial < limit)
				{
					index = 0;
					if (userBool != true)
					{
					userIn = JOptionPane.showInputDialog(null, "Enter Username");
					}
					while((userBool == false) && (index < 2))
					{
						
						System.out.println("Checking");
						if (userIn.equals(userData[index]) && userBool == false)
						{
							
							userBool = true;
						}
						
						else
						{
							index++;
						}
					
					}
					if (userBool == true)
					{
						passIn = JOptionPane.showInputDialog(null, "Enter Password");
						if (passIn == null)
							{
								JOptionPane.showMessageDialog(null, "Closing Program");
								System.exit(0);
							}
						if (passIn.equals(passData[index]))
							{
								//check
								passBool = true;
							}
						else 
							{
								//check
								passBool = false;
								JOptionPane.showMessageDialog(null, "Incorrect Password");
							}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Incorrect UserName");
					}
				}
				
				if ((trial < limit) && (userBool == true) && (passBool == true))
				{
					String input = (String) JOptionPane.showInputDialog(null, "Choose account type", "Choose",//
							JOptionPane.QUESTION_MESSAGE, null, accData, accData[1]);
					while (input != accData[index])
					{
						JOptionPane.showMessageDialog(null, "Wrong Account");
						input = (String) JOptionPane.showInputDialog(null, "Choose account type", "Choose",//
								JOptionPane.QUESTION_MESSAGE, null, accData, accData[1]);

					}
					switch (input)
					{
					case "Admin":
						if(index == 0)
						{
							switchCaseOptions.admin();//check
							Auth = true;
						}
						else
						{	
							JOptionPane.showMessageDialog(null, "Invalid Account Choice", "Warning", JOptionPane.WARNING_MESSAGE);
							Auth = false;
							trial++;
						}
						break;
					case "Student":
						if(index == 1)
						{
							switchCaseOptions.student();
							Auth = true;
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Invalid Account Choice", "Warning", JOptionPane.WARNING_MESSAGE);
							Auth = false;
							trial++;
						}
						break;
					case "Staff":
						if(index == 2)
						{
							switchCaseOptions.staff();
							Auth = true;
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Invalid Account Choice", "Warning", JOptionPane.WARNING_MESSAGE);
							Auth = false;
							trial++;
						}
						break;
					}
				//check
				}
				else
				{
					trial++;
				
				}

			}

		}
		
	}
