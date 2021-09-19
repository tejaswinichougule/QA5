package map;

import java.util.ArrayList;
import java.util.List;

public class Hmap7 {
	
	public static void main(String[] args) {
		List<st_7> st=new ArrayList<st_7>();
		
		st_7 s=new st_7();
		s.setid(1);
		s.setname("abc");
		s.setphno(12432);
		s.setaddr("pune");
		s.setdob("12/3/2021");
		s.setemail("abc@gmail.com");
		s.setgen("female");
		
		st.add(s);
		
		for(st_7 x:st) {
			System.out.println(x.getid());
			System.out.println(x.getname());
			System.out.println(x.getphno());
			System.out.println(x.getaddr());
			System.out.println(x.getdob());
			System.out.println(x.getemail());
			System.out.println(x.getgen());
			
		}
		
	}

}
