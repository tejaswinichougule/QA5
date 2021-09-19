package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class hmap {
	public static void main(String[] args) {
		
		Map<Integer,String> ma=new LinkedHashMap<Integer,String>();
		
		//add 
		ma.put(10, "java");
		ma.put(20, "sql");
		ma.put(30, "oops");
		ma.put(40, "sql");
		ma.put(50,"oracle");
		ma.put(60, "db");
		ma.put(10, "selenium");
		ma.put(50, "psql");
		ma.put(40, "haddop");
		System.out.println(ma);
		
	}

}
