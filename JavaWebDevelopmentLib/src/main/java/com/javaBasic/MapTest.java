package com.javaBasic;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,String> map = new HashMap<Integer, String>();
		 Map<Integer,String> map1 = new Hashtable<>();
		 
		    map.put(new Integer(1), "a");
		    System.out.println(map.put(new Integer(2), "b"));
		    map.put(1, "c");
		    System.out.println(map.containsKey(1));
		    System.out.println( map.get(1));
		    System.out.println(map);
		    System.out.println(map.entrySet());
		    System.out.println(map.keySet());
		    System.out.println(map.values());
		    
		    	// Get a set of the entries
		      Set set = map.entrySet();
		      // Get an iterator
		      Iterator i = set.iterator();
		      // Display elements
		      while(i.hasNext()) {
		         Map.Entry me = (Map.Entry)i.next();
		         System.out.print(me.getKey() + ": ");
		         System.out.println(me.getValue());
		        		 }
		    
		    
		    Hashtable companies = new Hashtable();


		 // Java Hashtable example to put object into Hashtable
		 // put(key, value) is used to insert object into map
		 companies.put("Google", "United States");
		 companies.put("Nokia", "Finland");
		 companies.put("Sony", "Japan");
		 Enumeration enumeration = companies.elements();
		 Enumeration hashtableKeysEnum = companies.keys();

		 while (enumeration.hasMoreElements()) {
			 System.out
			 .println("hashtable values: " + enumeration.nextElement());
			 }

		 while (hashtableKeysEnum.hasMoreElements()) {
			 System.out
			 .println("hashtable values: " + hashtableKeysEnum.nextElement());
			 }
	}
	

}
