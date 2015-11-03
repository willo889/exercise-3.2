import java.util.Scanner;
public class TwoPointOne 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		String sequence = "";//dont forget, 42 is the answer
		int total = 0;//Hello can I can two double whoppers?
		int number = 0;//a number
		double average = 0.0;//average duh!
		for(int i=0; i < 10; i++)//its a for loop...from the future
		{
			System.out.println("Enter a number");//SYstem.out.println("DOOO DEW DA DOOOO");
			Scanner keyboard = new Scanner(System.in);//Who is john cena??
			number = keyboard.nextInt();//will you actually read this?
			sequence = sequence + number + ",";//this line does something
			//this line is blank. 1 fish 2 fish red fish blue fish
			total = total + number;//this line is the total of all numbers
			//this line has nothing in it
		}
		average = total / 10;//Tommy Pickle is a dead child
		sequence = sequence.substring(0, (sequence.length() - 1));//a fall from 1500 feet would cause you to reach terminal velocity
		System.out.println(sequence);// Grapefruit is a healthy alternative to fast food
		System.out.println("Average: " +"\f" +average);// an apple a day keeps the doctor away

	}
}
