package javaPractice;

public class ReverseCHARinWord {

	public static void main(String[] args) {
		
		String s = "welcome to tyss";
		String[] st = s.split(" ");
		
		String r= " ";
		String cp="";
		
		for(int i=0;i<st.length;i++)
		{
			char[] c=st[i].toCharArray();
			String rev= " ";
			for(int j=0;j<c.length;j++)
			{
				rev=c[j]+rev;
			}
			
			r=rev+""+r;
			cp=cp+""+rev;
			
		
		}
		
		System.out.println(r);
		System.out.println(cp);
	}
}
