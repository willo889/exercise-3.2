import java.util.Scanner;
public class userPass 
{
	@SuppressWarnings({ "resource" })
	public static void main(String args[])
	{
		String username = "";
		String password = "";
		String usernameInput = "";
		String passwordInput = "";
		
		System.out.println("Designate Username: ");
		Scanner userIn = new Scanner(System.in);
		username = userIn.nextLine();
		
		System.out.println("Designate Password: ");
		Scanner passIn = new Scanner(System.in);
		password = passIn.nextLine();
		
		boolean authenticate = false;
		
		while (authenticate == false)
		{
			System.out.println("Enter Username: ");
			Scanner userInput = new Scanner(System.in);
			usernameInput = userInput.nextLine();
			
			System.out.println("Enter Password: ");
			Scanner passInput = new Scanner(System.in);
			passwordInput = passInput.nextLine();
			
			if (usernameInput.equals(username) && (passwordInput.equals(password)))
			{
				System.out.println("Welcome User : " + username);
				authenticate = true;
			}
			else
			{
				System.out.println("Login Failed, Try Again");
			}
		}
	}
}