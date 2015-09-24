import java.util.Scanner;
import java.util.Arrays;
/*
 * Made by Will O'Brien
 * Psuedocode:
 * Step1: Get number from user
 * Step2: Add number to array
 * Step3: Check each number for min and max
 * Step4: Put each number into the array
 * Step5: Repeat steps 1 through 4 four more times
 * Step6: Get sum
 * Step7: Get Average
 * Step8: Get Median
 * Step9: Output Sum, Average, Min, Max, and Median (No mode :( ) free 6% plz kthxbai
 */
public class assignment2 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int number;
		int totalNumbers = 0;
		double averageAll;
		int numberCount = 5;
		int min = 999999999; //max range of the integer type
		int max = -999999999; //minimum range of the integer type
		int arraySpot = 0;
		int[] inputArray = new int[5];

		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		;
		System.out.println("Enter five numbers.");
		while (numberCount != 0)
		{
			
			while (numberCount != 0)
			{
				Scanner keyboard = new Scanner(System.in);
				number = keyboard.nextInt();
				inputArray[arraySpot] = number;
				if (number > max)
				{
					max = number;
				}
				if (number < min)
				{
					min = number;
				}
				else
				{
					//do nothing
				}

				totalNumbers = totalNumbers + number;
				numberCount = numberCount - 1;
				arraySpot = arraySpot + 1;

			}
			number1 = inputArray[0];
			number2 = inputArray[1];
			number3 = inputArray[2];
			number4 = inputArray[3];
			number5 = inputArray[4];
			

	
		}
		Arrays.sort(inputArray);
		averageAll = totalNumbers / 5;
		System.out.println("Sum: " + totalNumbers);
		System.out.println("Avg: " + averageAll);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Median: " + inputArray[2]);
	}
}
