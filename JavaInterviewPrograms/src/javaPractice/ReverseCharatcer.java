package javaPractice;

public class ReverseCharatcer {
	public static void main(String[] args) {

		String str = "WElcome world";
		char[] ch=str.toCharArray();
		String rev = " ";
		
		for(int i=0;i<ch.length;i++)
		{
			rev=ch[i]+rev;
		}
		
		System.out.println(rev);
	}

}
