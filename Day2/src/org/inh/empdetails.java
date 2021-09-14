package org.inh;

public class empdetails extends coursedetails {
	
	public void empname() {
		System.out.println("jaav");
	}
	
	public void empid() {
		System.out.println(25);
		
	}
	public void emploc() {
		System.out.println("india");
		
	}
	public static void main(String[] args) {
		empdetails em=new empdetails();
		em.empname();
		em.empid();
		em.emploc();
		
		
		em.javacourse();
		em.seleniumcourse();
	}

}
