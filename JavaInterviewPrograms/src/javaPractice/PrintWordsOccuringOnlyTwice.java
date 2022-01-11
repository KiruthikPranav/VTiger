package javaPractice;

import java.util.HashSet;

public class PrintWordsOccuringOnlyTwice {
	
public static void main(String[] args) {
		
		String s= "welcome well welcome to mandya to bang bang";
		String[] str = s.split(" ");
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);
		
		for(String c:set) {
			int count=0;
		
		for(int i=0;i<str.length;i++) {
			if(c.equals(str[i])) {
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println(c+"="+count);
		}
		
		}
	}

}
