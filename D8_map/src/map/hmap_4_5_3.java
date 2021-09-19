package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class hmap_4_5_3 {
	
	public static void main(String[] args) {
		Map<String,String> ma=new TreeMap<String,String>();
		
		ma.put("!", "10");
		ma.put("@","20");
		ma.put("#", "30");
		ma.put("$", "40");
		ma.put("%", "50");
		ma.put("^","60");
		ma.put("&", "10");
		ma.put("*", "50");
		ma.put("(", "40");
		
		System.out.println(ma);
		
		// use entry
		Set<Entry<String,String>>av=ma.entrySet();
		for(Entry<String,String>x:av) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
	}
}
