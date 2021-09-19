package map;

import java.util.ArrayList;
import java.util.List;


public class hmap_6 {

	public static void main(String[] args) {
		
		List<Hamp6> mp=new ArrayList<Hamp6>();
		
		Hamp6 h1=new Hamp6();
		h1.setid(1);
		h1.setname("abc");
		h1.setphno(12323);
		h1.setaddr("pune");
		h1.setdate("12/12/2001");
		h1.setdate11("1/3/2002");
		h1.setmail("abc@gmail.com");
		h1.setgen("female");
		h1.setsalary(1234.45f);
		
		Hamp6 h11=new Hamp6();
		h11.setid(2);
		h11.setname("xyz");
		h11.setphno(124);
		h11.setaddr("solapur");
		h11.setdate("23/4/2004");
		h11.setdate11("7/9/2010");
		h11.setmail("xyz@gmail.com");
		h11.setgen("male");
		h11.setsalary(4334.76f);
		
		mp.add(h1);
		mp.add(h11);
		
		for(Hamp6 x:mp) {
			System.out.println(x.getid());
			System.out.println(x.getname());
		System.out.println(x.getphno());
		System.out.println(x.getaddr());
		System.out.println(x.getdate());
		System.out.println(x.getdate11());
		System.out.println(x.getdate());
		System.out.println(x.getmail());
		System.out.println(x.getgen());
		System.out.println(x.getsalary());
		}
		
		Hamp6 h=mp.get(1);
		System.out.println(h.getid());
		System.out.println(h.getname());
		System.out.println(h.getphno());
		System.out.println(h.getaddr());
		System.out.println(h.getdate());
		System.out.println(h.getdate11());
		System.out.println(h.getmail());
		System.out.println(h.getgen());
		System.out.println(h.getsalary());
		
	}			
		
}
