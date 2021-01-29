package collectionsPrcatice;

import java.util.HashMap;
import java.util.TreeMap;

public class SortKeysInHashMapInAcsendingOrder {
	
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		 map.put(10,"Campaign");
		 map.put(30,"Product");
		 map.put(90,"PurchaseOrder");
		 map.put(40,"Contacts");
		 map.put(20,"Leads");
		 map.put(70,"Quote");
		 TreeMap<Integer,String> map1=new TreeMap<Integer,String>(map);
		 System.out.println(map1.keySet());
		 //System.out.println(map1.descendingKeySet());

		
	}

}
