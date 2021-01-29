package javaPractice;

import java.util.HashSet;

public class NoOfDuplicateWords {
	
public static void main(String[] args) {
		
		String s= "welcome well welcome to mandya to bang";
		String[] str = s.split(" ");
		int count1 =0;
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);
		
		for(String c:set) 
		{
			int count=0;
		for(int i=0;i<str.length;i++) 
		{
			if(c.equals(str[i])) 
			{
				count++;
			}
			
		}
		if(count>1) 
		{
			count1++;	
		}
		}
		System.out.println("total no of duplicates are "+count1);
}

}
