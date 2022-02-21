package com.TestYantra.VTiger;

public class TlDemo {

	public static void main(String[] args) {
		String name ="Good Noon Mam";
		String[] name2 = name.split(" ");
		for(String value : name2) {
			for(int i=0;i<value.length();i++) {
				if(i==0)
					System.out.println(value.charAt(0));
			}
		}
		
		/*
		 * String value = "aaaaaabbbbbbbccccccccccccdddb";
		int secondRepeating = 0;
		LinkedHashSet<Character> valueNonRepeated = new LinkedHashSet<Character>();
		for (int i = 0; i < value.length(); i++) {
			valueNonRepeated.add(value.charAt(i));
		}
		for (char j : valueNonRepeated) {
			int m = 0;
			for (int i = 0; i < value.length(); i++) {
				if (j == value.charAt(i)) {
					m++;
					
				}
			}
			if (m > 1) {
				System.out.println(j + " " + m);
				secondRepeating++;
			}
			if(m>1 && secondRepeating==3) {
				System.out.println("Number of occurence of :"+j+" is "+m);
			}
			
		}*/
		
	}
}
