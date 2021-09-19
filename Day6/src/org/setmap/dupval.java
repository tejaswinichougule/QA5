package org.setmap;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class dupval {
	public static void main(String[] args) {
		
		Map<Integer,String> ma=new LinkedHashMap<Integer,String>();
		
		// add val in map
		ma.put(10, "java");
		ma.put(20, "java");
		ma.put(30, "aws");
		ma.put(40, "java");
		ma.put(10, "api");
		
		System.out.println(ma);
	
	
		// method to get particular val
		
	/*	String s=ma.get(30);
		System.out.println(s);
	
	// to check parti val present or not
	boolean ck=ma.containsKey(20);
	System.out.println(ck);
	
	// check parti val
	boolean cv=ma.containsValue("aws");
	System.out.println(cv);
	
	// print only key from map
	Set<Integer> ks=ma.keySet();
	System.out.println(ks);
	
	// print val from map
	Collection<String> va=ma.values();
	System.out.println(va);*/
	
	// CANT USE LOOP
	//THEN USE ENTRY SET
	Set<Entry<Integer,String>>es=ma.entrySet();
	for(Entry<Integer,String>x:es) {
	System.out.println(x.getKey());
	System.out.println(x.getValue());
	
	}
	
	
	}
	
}
