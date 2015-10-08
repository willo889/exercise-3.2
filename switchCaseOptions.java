import javax.swing.JOptionPane;
public class switchCaseOptions 
{
	public static void admin()
	{
		String[] options = { "Update File", "Read File", "Exit" };
		JOptionPane.showInputDialog(null, "Welcome Admin. Choose option", "Selection", //
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
	}
	public static void student()
	{
		String[] options = { "Read File", "Exit" };
		JOptionPane.showInputDialog(null, "Welcome Student. Choose option", "Selection", //
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);	
	}
	public static void staff()
	{
		String[] options = { "Update File", "Read File", "Add File", "Delete File", "Exit"};
		JOptionPane.showInputDialog(null, "Welcome Staff. Choose option", "Selection", //
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
	
	{
		
	}
	}
}

