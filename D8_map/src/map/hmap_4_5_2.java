package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hmap_4_5_2 {
	public static void main(String[] args) {
	
	Map<Integer,String> ma=new LinkedHashMap<Integer,String>();
	
	ma.put(10, "10");
	ma.put(20, "20");
	ma.put(30, "30");
	ma.put(40, "40");
	ma.put(50, "50");
	ma.put(60, "60");
	ma.put(10, "10");
	ma.put(50, "50");
	ma.put(40, "40");
	
	System.out.println(ma);
	
	// use entry
	Set<Entry<Integer,String>> ac=ma.entrySet();
	for(Entry<Integer,String>x:ac) {
		System.out.println(x.getValue());
		System.out.println(x.getKey());
		
	}
		
	}

}
