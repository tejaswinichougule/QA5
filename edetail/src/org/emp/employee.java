package org.emp;

public class employee {
	
	private void empid(String name, int id) {
		System.out.println("name and empid"+name+" "+id);
	}
	
	private void empid(int id, String name ) {
		System.out.println("id and name"+id+" "+name);
	}
	
	private void empid(int id, String name,long phno,boolean status) {
		System.out.println("id,name,phno,status"+id+" "+name+" "+phno+" "+status);
		
	}
	public static void main(String[] args) {
		employee em=new employee();
		em.empid("abc",1);
		em.empid(2,"xyz");
		em.empid(3,"ert",123456,true);
		
	}
		


}
