package map;

import java.util.Hashtable;
import java.util.Map;

public class htable_1_4 {

	public static void main(String[] args) {
		Map<String ,String> ma=new Hashtable<String,String>();
		
		ma.put("vel","selenium");
		ma.put("ganesh", "framework");
		ma.put("dinesh", "oracle");
		ma.put("vengat", "corejava");
		ma.put("subhash", "jira");
		
		System.out.println(ma);
	}
}
