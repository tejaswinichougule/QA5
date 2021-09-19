package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class hmap_4 {
	public static void main(String[] args) {
		
		Map<Integer,String> ma=new HashMap<Integer,String>();
		
		ma.put(10,"java");
		ma.put(20, "sql");
		ma.put(30, "oops");
		ma.put(40,"sql");
		ma.put(50, "oracle");
		ma.put(60, "db");
		ma.put(10, "selenium");
		ma.put(50, "psql");
		ma.put(40, "hadoop");
		
		System.out.println(ma);
		
		//ITERATE USING ENTRY
		Set<Entry<Integer,String>>es1=ma.entrySet();
		for(Entry<Integer,String>x:es1) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
		
	}

}

