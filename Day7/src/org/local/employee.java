package org.local;

public class employee {
	
	//local var  @method level
	private void empname(String name) {
		System.out.println(name);
		
	}
	
	private void add(int empid) {
		System.out.println(empid);
	}

	public static void main(String[] args) {
		employee e=new employee();
		e.empname("java");
		e.add(1);
	}
}
