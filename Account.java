public class Account
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