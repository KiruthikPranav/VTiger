package javaPractice;

public class Recursion {
	public static int count=1;

	public static void main(String[] args) {
		
		name();
		

	}
	
	public static void name()
	{
		if(count<=10)
		{
			System.out.println("chaitra "+count);
			count++;
			name();
		}
		System.out.println("here");
	}
}
