package javaPractice;

public class SkipFirstAndMultiplyConsecutive {
	
	public static void main(String[] args) {
		
		String s="12345";
		int count =0;
		//int mul=1;
		//int a = Integer.parseInt(s);
		
		for(int i=0;i<s.length();i++)
		{ int mul=1;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j)
				{
					mul=mul*(s.charAt(j)-48);
					count++;
				}
				
				
			}
			System.out.println(mul);
		}
		
	}

}
