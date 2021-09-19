package map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hmap_4_5_4 {
	
	public static void main(String[] args) {
		Map<String ,String> ma=new Hashtable<String,String>();
		
		ma.put("vel","selenium");
		ma.put("ganesh", "framework");
		ma.put("dinesh", "oracle");
		ma.put("vengat", "corejava");
		ma.put("subhash", "jira");
		
		System.out.println(ma);
		
		// iterate 
		
		Set<Entry<String,String>>aw=ma.entrySet();
		for(Entry<String,String>x:aw) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
	}	

}
