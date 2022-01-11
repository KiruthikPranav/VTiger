package javaPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		String given = "Welcome wepp";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<given.length();i++)
		{
			set.add(given.charAt(i));
		}
		
		
		for(Character c:set)
		{
			System.out.print(c);
		}
		
		
		 
		
		
		
		
		
		
		
		
	}

}
