package javaPractice;

public class ReverseWords {
	
	public static void main(String[] args) 
			{
		String str = "welcome to tyss";
		String[] s=str.split(" ");
		String rev=" ";
		for(int i=0;i<s.length;i++)
		{
			rev=s[i]+" "+rev;
			
		}
		System.out.println(rev);
	}
	
}
