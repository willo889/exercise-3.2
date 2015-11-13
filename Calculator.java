
public class Calculator 
{
	static int array[] = { 4, 7, 3, 1, 9 };
	
	public static int getSum()
	{
		int sum = 0;
		int index = 0;
		while (index < 5)
		{
			sum = sum + array[index];
			index++;
		}
		return sum;
	}
	public static double getAvg()
	{
		double average = 0;
		average = (double) getSum() / 5;
		return average;
	}
	public static int getPro()
	{
		int index = 0;
		int product = 1;
		
		while (index < 5)
		{
			product = product * array[index];
			index++;
		}
		return product;
	}
	public static int getFact(int factorial)
	{
		int fact = 1;
		while (factorial > 0)
		{
				fact = fact * factorial;
				factorial--;
		}
		return fact;
	}
	
}