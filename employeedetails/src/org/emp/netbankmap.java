package org.emp;

import java.nio.charset.MalformedInputException;
//import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class netbankmap {

  public static void main(String[] args) {
	
	  Map<Integer,String>ma=new LinkedHashMap<Integer,String>();
	  
	  // to add val  
	  ma.put(10,"java");
	  ma.put(20,"java");
	  ma.put(30,"aws");
	  ma.put(40,"java");
      ma.put(10,"api");
	  
	  System.out.println(ma);
	  
	//to get parti val from mao
	  String s=ma.get(30);
	  System.out.println(s);
	  
	  //to cjeck parti key is persent or not
	  boolean ck=ma.containsKey(20);
	  System.out.println(ck);
	  
	  // to check parti val present or not
	  boolean cv=ma.containsValue("aws");
	  System.out.println(cv);
	  
	  //to print only the key from map
	  Collection<String> va=ma.values();
	  System.out.println(va);
	  
	  //iterate
	  Set<Entry<Integer,String>> es=ma.entrySet();
	  for(Entry<Integer,String> x:es) {
		  System.out.println(x.getKey());
		  //System.out.println(x.getValue);
	  }
	  
	  
}
}
