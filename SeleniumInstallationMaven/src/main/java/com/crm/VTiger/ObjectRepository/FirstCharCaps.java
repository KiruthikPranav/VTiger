package com.crm.VTiger.ObjectRepository;

public class FirstCharCaps {
	public static void main(String[] args) {
		
		String name = "my name is kiruthik";
		String[] firstUpper = name.split(" ");
		
		for(int i =0; i<firstUpper.length;i++) {
			//System.out.println(firstUpper[i]);
			char ch[] = firstUpper[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				ch[0]=(char)(ch[0]-32);
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}