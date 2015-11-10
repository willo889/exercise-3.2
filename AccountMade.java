import javax.swing.JOptionPane;

public class AccountMade
{
	String userName = "";
	String passWord = "";
	String accType = "";
	
	AccountMade()//default
	{
		userName = "not set";
		passWord = "not set";
		accType = "not set";
	}
	
	AccountMade(String theUser, String thePass, String theAcc)
	{
		userName = theUser;
		passWord = thePass;//default constructor
		accType = theAcc;
	}
	
	public void getUserName(String userName)
	{
		this.userName = userName;  //gets username
	}
	public String setUserName(String userName)
	{
		return userName; //sets username
	}
	public void getPassWord(String passWord)
	{
		this.passWord = passWord; //gets password
	}
	public String setPassWord(String passWord)
	{
		return passWord; //sets password
	}
	public void getAccount(String accType)
	{
		this.accType = accType; //gets password
	}
	public String setAccount(String accType)
	{
		return accType; //sets password
	}
	public void toString(String userName, String passWord, String accType)
	{
		JOptionPane.showMessageDialog(null, "Username: " + userName + ", Password: " + passWord + ", Account Type: " + accType);
		
	}

}
class AccountCreation
{
	

	public static void main(String args[])
	{
		AccountMade account1 = new AccountMade("Ovie", "TheGreat8", "Admin");
		System.out.println(account1.userName);
		System.out.println(account1.passWord);
		System.out.println(account1.accType);
		System.out.println("");
		
		AccountMade account2 = new AccountMade("Backstrom", "Backy", "Staff");
		System.out.println(account2.userName);
		System.out.println(account2.passWord);
		System.out.println(account2.accType);
		System.out.println("");
		
	}
}