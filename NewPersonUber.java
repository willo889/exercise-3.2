import java.util.Scanner;
public class NewPersonUber 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
	Person p1 = new Person();
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter First Name");
	String firstName = keyboard.nextLine();
	System.out.println("Enter Last Name");
	p1.getFirstName(firstName);
	String lastName = keyboard.nextLine();
	p1.getLastName(lastName);
	System.out.println("Enter Age");
	int age = keyboard.nextInt();
	p1.getAge(age);
	p1.toString(p1.firstName, p1.lastName, p1.age);
	
	
	Person p2 = new Person();
	Scanner keyboard2 = new Scanner(System.in);
	System.out.println("Enter First Name");
	firstName = keyboard2.nextLine();
	p2.getFirstName(firstName);
	System.out.println("Enter Last Name");
	lastName = keyboard2.nextLine();
	p2.getLastName(lastName);
	System.out.println("Enter Age");
	age = keyboard2.nextInt();
	p2.getAge(age);
	p2.toString(p2.firstName, p2.lastName, p2.age);

	if(p1.firstName.equals(p2.firstName) && (p1.lastName.equals(p2.lastName)) && (p1.setAge() == p2.setAge()))
	{
		System.out.println("They Are The Same Person");
	}
	else
	{
		System.out.println("These two people are not the same");
		
	}
	if (p1.firstName.equals(p2.firstName) && (p1.lastName.equals(p2.lastName)))
	{
		System.out.println("THey Have the Same Names");
	}
	else
	{
		System.out.println("They do not have the same names");
	}
	if (p1.setAge() > p2.setAge())
	{
		System.out.println(p1.firstName +" "+ p1.lastName +" is older than "+ p2.firstName +" "+ p2.lastName);
		System.out.println(p2.firstName +" "+ p2.lastName +" is younger than "+ p1.firstName +" "+ p1.lastName);
	}
	else if (p2.setAge() > p1.setAge())
	{
		System.out.println(p2.firstName +" "+ p2.lastName +" is older than "+ p1.firstName +" "+ p1.lastName);
		System.out.println(p1.firstName +" "+ p1.lastName +" is younger than "+ p2.firstName +" "+ p2.lastName);
	}
	else
	{
		System.out.println(p2.firstName +" "+ p2.lastName +" is the same age as "+ p1.firstName +" "+ p1.lastName);
	}
	}
}
