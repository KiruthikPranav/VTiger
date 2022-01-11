package collectionsPrcatice;

import java.util.ArrayList;
import java.util.Collections;

public class Run {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		EmployeeComp e=new EmployeeComp(001);
		System.out.println(e);
		EmployeeComp f=new EmployeeComp(005);
		System.out.println(f);
		EmployeeComp g=new EmployeeComp(002);
		System.out.println(g);
		EmployeeComp h=new EmployeeComp(004);
		System.out.println(h);
		
		list.add(e);
		//System.out.println();
		list.add(f);
		list.add(g);
		list.add(h);
		
	Collections.sort(list);;
	System.out.println(list);
		
	}

}
