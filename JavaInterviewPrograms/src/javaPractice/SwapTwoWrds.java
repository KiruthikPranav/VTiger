package javaPractice;

public class SwapTwoWrds {
	
	public static void main(String[] args) {
		
		String s = "welcome to tyss company";
		String[] st = s.split(" ");
		String temp = st[0];
		st[0]= st[st.length-1];
		st[st.length-1]=temp;
		String rev=" ";
		for(int i=0;i<=st.length-1;i++)
		{
		   rev=rev+" "+st[i];
		}
		System.out.println(rev);
		
	}
}
		
	
	
