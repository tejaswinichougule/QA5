package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class hmap_3 {
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
	
	//PRINT ONLY VALUE
	Collection<String>sa=ma.values();
	System.out.println(sa);

}
}