package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class hmap_2_2 {
	
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
		
		// PRINT KEY VALUE
		
		Set<Integer>ks=ma.keySet();
		System.out.println(ks);
	}

}
