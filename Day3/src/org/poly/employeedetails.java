package org.poly;



public class employeedetails {
	
	// depend on datatype
	private void getemp(String name) {
		System.out.println("name"+name);
	}
	
	// depend on order of datatype
	private void getemp( String name,int id ) {
		System.out.println(" name and id"+name+" "+id);
	}
	
	private void getemp(int id, String name) {
		System.out.println("id,name,phno,status"+id+" "+name);
	}
	
	private void getemp(int id,String name,long phno,boolean status) {
		System.out.println("id,name,phno,and status is->"+id+" "+name+" "+phno+" "+status);
	}
	public static void main(String[] args) {
		employeedetails em=new employeedetails();
		em.getemp("java");
		em.getemp("selenium",234);
		em.getemp(765,"API");
		em.getemp(214,"AWS",5623463,true);
		
	}
		


}



