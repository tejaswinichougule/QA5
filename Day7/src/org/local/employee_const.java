package org.local;

public class employee_const {
	
	// local var @constructor level
	public employee_const(int age) {
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		employee_const e=new employee_const(20);
		//e.empname("java");
		
		
		// local vr ar @block level
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}