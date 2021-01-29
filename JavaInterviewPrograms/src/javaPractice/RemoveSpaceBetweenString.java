package javaPractice;

public class RemoveSpaceBetweenString {

	
	public static void main(String[] args) {
		
		String s="my name is chaitra";
		String s1=" ";
		
		String[] spl=s.split(" ");
		for(int i=0;i<spl.length;i++)
		{
			s1=s1+spl[i];
		}
		System.out.println(s1);
	}
}
