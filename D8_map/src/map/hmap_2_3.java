package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hmap_2_3 {
	
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
		
		// PRINT KEY VALUE
		Set<String> sa=ma.keySet();
		System.out.println(sa);
	}
}
