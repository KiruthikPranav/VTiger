package javaPractice;

public class ExtractDigitsAndSum {
	
	public static void main(String[] args) {
		
		String s="1a2b3c@12abc%10";
		int num=0;
		
		for(int i=0;i<s.length();i++)
		{
		 if(s.charAt(i)>='0' && s.charAt(i)<='9')//s.charAt(i)>48 && s.charAt(i)<57 can also be used
		 {
			 String s1=s.charAt(i)+"";
			 //or character can be directly converted to integer by subtracting character with 48
			 int ch1=Integer.parseInt(s1);
			 //int ch1=s.charAt(i)-48-->using the ASCII value-->ASCII value of 0 is 48,1 is 49......
			 num=num+ch1;
		 }
			 
		 }
		System.out.println(num);
		
		
	}

}
