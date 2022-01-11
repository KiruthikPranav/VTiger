package javaPractice;

public class EvenIndexToUpperCase {
	
	public static void main(String[] args) {
		
		String s="indIa";

		char[] ch=s.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='I')
				{//using wrapper class of the character to get the inbuilt methods.
					System.out.print(Character.toLowerCase(ch[i]));
				}
			else
				System.out.print(Character.toLowerCase(ch[i]));
		
	}

	}
}

