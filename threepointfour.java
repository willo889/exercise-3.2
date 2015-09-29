import javax.swing.JOptionPane;

public class threepointfour 
{
	public static void main(String args[])
	{
		//Braniganns Law is like Braniganns Love: Hard and Fast
		int numPeople = 0;
		int groupSize = 0;
		numPeople = Integer.parseInt( JOptionPane.showInputDialog("Enter number of people"));
		
		if (numPeople > 10)//My strategy is so simple an idiot could have devised it
		{
			groupSize = numPeople / 2;
			JOptionPane.showMessageDialog(null, "Number of people = "+ numPeople + " Group size = " + groupSize);
		}
		else if (numPeople <=10 && numPeople >= 3)
		{
			groupSize = numPeople / 3;
			JOptionPane.showMessageDialog(null, "Number of people = " + numPeople + " Group size = " + groupSize);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Not enough people", "Warning!!", JOptionPane.WARNING_MESSAGE);
		}
		
		//If we can hit that bullseye the rest of the dominos will fall like a house of cards. Checkmate.
		
		int numPlayers = Integer.parseInt( JOptionPane.showInputDialog("Enter the number of players"));
		int teamSize = 0;
		
		if(numPlayers >= 11 && numPlayers <= 55)//She's built like a steakhouse, but she handles like a bistro
		{
			teamSize = numPlayers / 11;
			JOptionPane.showMessageDialog(null,"Number of players = " + numPlayers + " Team size = " + teamSize);
		}
		else
		{
			teamSize = 1;//In the game of chess you can never let your opponnent see your pieces
			JOptionPane.showMessageDialog(null,"Number of players = " + numPlayers + " Team size = " + teamSize);
		}
	}
}
