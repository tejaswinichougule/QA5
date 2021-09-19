package org.setmap;

import java.util.ArrayList;
import java.util.List;

public class nb {

		public static void main(String[] args) {
			
			List<employee> em=new ArrayList<employee>();
			
			employee e1=new employee();
			e1.setId(1);
			e1.setName("java");
			e1.setemail("qqq@gmail.com");
			e1.setPhNo(702819109);
			
			employee e2=new employee();
			e2.setId(2);
			e2.setName("aws");
			e2.setemail("abc@gmail.com");
			e1.setPhNo(9078568);
			
			employee e3=new employee();
			e3.setId(1);
			e3.setName("aws");
			e3.setemail("qsq@gmail.com");
			e3.setPhNo(1233254690);
			
			em.add(e1);
			em.add(e2);
			em.add(e3);
			
			for(employee x:em) {
				System.out.println(x.getId());
				System.out.println(x.getName());
			System.out.println(x.getemail());
			System.out.println(x.getPhNo());
			
			}
			
			employee emp=em.get(1);
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getemail());
			System.out.println(emp.getPhNo());
		}
	}

