package org.emp;

import org.client.client;
import org.company.company;
import org.project.project;

public class employee {
	
	public void empname() {
		System.out.println("xyz");
		
	}
	public static void main(String[] args) {
		employee em=new employee();
		em.empname();
		
		company cp=new company();
		cp.compname();
		
		client cl=new client();
		cl.cliname();
		
		project po =new project();
		po.projname();
		
	}
	

}
