package javaPractice;

public class SumOfFirstThreeMinimum {//sort in ascending order to find minimum

	
	public static void main(String[] args) {
		
		int ch[]={1,4,3,6,8,9,0,5,2,7,9};
		int temp=0;
		int sum=0;
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=1;j>ch.length-i;j++)
			{
				if(ch[j-1]<ch[j]) 
				{
					temp=ch[j-1];
					ch[j-1]=ch[j];
					ch[j]=temp;
				}
				
			}
			
		}
		
		for(int i=0;i<2;i++)
		{
			sum=sum+ch[i];
		}
		System.out.println(sum);
		
		/*for(int i=ch.length-1;i>=ch.length-3;i--)
		{
			sum=sum+ch[i];
		}
		System.out.println(sum);
		*/
	}
}
