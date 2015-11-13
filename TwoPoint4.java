
public class TwoPoint4 
{
	public static void main(String args[])
	{
		String twoPointer = " The Lord Of The Rings ";
	
		System.out.println(twoPointer.charAt(5));
		System.out.println(twoPointer.concat(twoPointer));
		System.out.println(twoPointer.equals(twoPointer));
		System.out.println(twoPointer.equalsIgnoreCase(twoPointer.toUpperCase()));
		System.out.println(twoPointer.indexOf("h"));
		System.out.println(twoPointer.lastIndexOf("h"));
		System.out.println(twoPointer.toUpperCase());
		System.out.println(twoPointer.toLowerCase());
		System.out.println(twoPointer.replace("Rings", "Flies"));
		System.out.println(twoPointer.substring(5));
		System.out.println(twoPointer.substring(0, 10));
		System.out.println(twoPointer.trim());
	}
}
