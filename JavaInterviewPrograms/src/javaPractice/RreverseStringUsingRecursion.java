package javaPractice;

public class RreverseStringUsingRecursion {
	
	public static int count=0;
	
	public static void main(String[] args) {
		
		reverseEachCharacter();		
	}
	
	public static void reverseEachCharacter()
	{
		
		String str = "Welcome world";
		char[] ch=str.toCharArray();
		String rev = "";
		if(count<ch.length)
		{
			rev=ch[count]+rev;
			count++;
			System.out.print(rev);
			reverseEachCharacter();
			
		}
		
		
		
	}
}

