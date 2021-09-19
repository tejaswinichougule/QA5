package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class htable_2 {
	
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
		
		// PRINT KEY ONLY
		Set<Integer> ka=ma.keySet();
		System.out.println(ka);
	}

}
