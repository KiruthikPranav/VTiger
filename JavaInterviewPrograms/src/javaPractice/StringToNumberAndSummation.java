package javaPractice;

public class StringToNumberAndSummation {
	
	public static void main(String[] args) {
		
		String s= "123";
		int sum=0;
		int dig=1;
		int num=Integer.parseInt(s);
		while(num>0)
		{
			dig = num%10;
			sum=sum+dig;
			num=num/10;
		}
		System.out.println(sum);
	}

}
