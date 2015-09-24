import java.util.Scanner;
public class threepointone 
{
	/*
	 * Step 1: Prompt user to select
	 * Step 2: run until option 6 selected
	 * Step 3: any other entry goes to step 1
	 * Step 4: depending on the option run through process
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		boolean runLoop = true;
		
		while (runLoop == true)//to run over and over again
		{
			System.out.println("Enter options");
			System.out.println("1) printf with %s");
			System.out.println("2) printf with %c");
			System.out.println("3) printf with %d");// Options for user
			System.out.println("4) printf with %e");
			System.out.println("5) printf with %f");
			
			Scanner keyboard = new Scanner(System.in);
			int userInput = keyboard.nextInt();
			
			if (userInput == 1)
			{
				System.out.format("%s", "hello");
				System.out.println("");
				System.out.format("%S", "wHaTs Up");//for %s
				System.out.println("");
				userInput = 0;
			}
			if (userInput == 2)
			{
				System.out.println("Using the char 'a'");// for %c
				System.out.printf("%c", 'a');
				System.out.println("");
				System.out.printf("%C", 'a');
				System.out.println("");
				userInput = 0;
			}
			if (userInput == 3)
			{
				System.out.println("Enter 'Decimal Integer'");//to turn decimal into integer
				Scanner keyboard4 = new Scanner(System.in);
				int userDecInput = (int) keyboard4.nextDouble();
				System.out.printf("%d", userDecInput);
				System.out.println("");
				userInput = 0;
			}
			if (userInput == 4)
			{
				System.out.println("Exponential Stuff");//to turn big numbers into kinda like scientific notation
				System.out.println("Enter number yo!");
				Scanner keyboard5 = new Scanner(System.in);
				double userExpo = keyboard5.nextDouble();
				System.out.format("%e", userExpo);
				System.out.println("");
				userInput = 0;
			}
			if (userInput == 5)
			{
				System.out.println("Enter long decimal number thingy");//trims the long decimals
				Scanner keyboard6 = new Scanner(System.in);
				double userDoubleF = keyboard6.nextDouble();
				System.out.printf("%.2f", userDoubleF);
				System.out.println("");
				userInput = 0;
			}
			if (userInput == 6)
			{
				runLoop = false; //ends program
			}
			else
			{
				runLoop = true;//if you enter in something else besides 1-6
			}
			
		}
	}
}
