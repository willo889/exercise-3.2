
public class Person
{
		String firstName = "";
		String lastName = "";
		int age = 0;
		
		Person()
		{
			firstName = "nothing";
			lastName = "nothing";
			age = 0;
		}
		Person(String firstName, String lastName, int age)
		{
			String fName = firstName;
			String lName = lastName;
			int theage = age;
		}
		
		public void getFirstName(String firstName)
		{
			this.firstName = firstName;
		}
		public void getLastName(String lastName)
		{
			this.lastName = lastName;
		}
		public void getAge(int age)
		{
			this.age = age;
		}
		public void toString(String firstName, String lastName, int age)
		{
			System.out.println(firstName +" "+ lastName+ ": is " + age + " years old");
		}
		public String setFirstName()
		{
			return firstName;
		}
		public String setLastName()
		{
			return lastName;
		}
		public int setAge()
		{
			return age;
		}

		

		
}
