package com.crm.VTiger.ObjectRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

class Alpha{
	
}

public class Collections {
	public static void main(String[] args) {
		
		Alpha a = new Alpha();
		
		LinkedHashSet name = new LinkedHashSet();
		
		name.add("String");
		name.add("String");
		name.add("Alpha");
		name.add(40);
		name.add(2);
		name.add(2);
		name.add(5);
		name.add(10);
		name.add(-2);
		name.add(1.0);
		name.add(true);
		name.add(false);
		name.add(null);
		name.add(null);
		
		Iterator itr = name.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}
}