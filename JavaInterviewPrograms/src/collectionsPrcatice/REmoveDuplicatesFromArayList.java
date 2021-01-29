package collectionsPrcatice;

import java.util.ArrayList;
import java.util.TreeSet;

public class REmoveDuplicatesFromArayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(70);
		list.add(70);
		
		TreeSet<Integer> set=new TreeSet<>(list);
		//since treeset doesnot allow duplicates, all the duplicates in arraylist will be removed 
		//and sorted in ascending order by default
		System.out.println(set);
		//to sort in descending order use descendingSet()
		System.out.println(set.descendingSet());
	
	}
}
