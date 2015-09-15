import java.util.Scanner;
public class rectangle 
{
	public static void main(String args[])
	{
		double length;
		double height;
		double perimeter;
		double area;
		
		System.out.println("Enter length of rectangle");
		Scanner k1 = new Scanner(System.in);
		length = k1.nextDouble();
		
		System.out.println("Enter height of rectangle");
		Scanner k2 = new Scanner(System.in);
		height = k2.nextDouble();
		
		perimeter = 2 * (length + height);
		area = length * height;
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
	}
}
