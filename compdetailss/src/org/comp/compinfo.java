package org.comp;

public class compinfo {
	
	private void empname(String name, int id) {
		System.out.println("name and empid"+name+" "+id);
	}
	 
	 private void empname(String name,int id, float sal) {
		 System.out.println("name ,id,sal is"+name+" "+id+" "+sal);
		 
	 }
	 
	 private void empname(int id) {
		 System.out.println("id is"+id);	
	}
	 public static void main(String[] args) {
		
		 compinfo cm=new compinfo();
		 cm.empname("abc",1);
		 cm.empname("abc",2,123);
		 cm.empname(12);
	}

}
