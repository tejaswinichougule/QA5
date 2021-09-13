package org.college;

import java.util.ArrayList;
import java.util.List;

public class nb {

	public static void main(String[] args) {
		
		List<employee> emp=new ArrayList<employee>();
		
		employee e1=new employee();
		e1.setId(1);
		e1.setName("java");
		e1.setemail("qqq@gmail.com";
		e1.setPhno(12332546565);
		
		employee e2=new employee();
		e2.setId(2);
		e2.setName("aws");
		e2.setEmail("abc@gmail.com")
		e1.setPhno(123324331254);
		
		employee e3=new employee();
		e3.setId(1);
		e3.setName("aws");
		e3.setemail("qsq@gmail.com");
		e3.setPhno(12332546905);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		for(employee x:emp) {
			System.out.println(x.getId());
			System.out.printlnx.getName());
		System.out.println(x.getEmail());
		System.out.println(x.getPhno);
		
		}
		
		employee em=emp.get(1);
		System.out.println(em.getId());
		System.out.println(em.getName());
		System.out.println(em.getEmail());
		System.out.println(em.getPhno);
	}
}
