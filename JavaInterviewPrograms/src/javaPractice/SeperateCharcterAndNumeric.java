package javaPractice;

public class SeperateCharcterAndNumeric {
	
	public static void main(String[] args)
	{
		String s="Abc123@$cdef";
		String num=" ";
		String character=" ";
		String spchar=" ";
	
		for(int i=0;i<s.length();i++)
		  {
		   char ch=s.charAt(i);
		   
		  
		  if((ch>=97 && ch<=122) ||(ch>=65 && ch<=90)) {
		   character=character+ch;
		  }
		  else if(ch>=48 && ch<=57)
		  {
			  num=num+ch;
		  }
		  else
		  {
			  spchar=spchar+ch;
		  }
		 }
		 System.out.println(character+" ");
		 System.out.println(num+" ");
		 System.out.println(spchar+" ");

			
	}

}
