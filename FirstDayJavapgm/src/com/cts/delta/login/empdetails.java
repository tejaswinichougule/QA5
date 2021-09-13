package com.cts.delta.login;

public class empdetails {

	public void empname() {
		System.out.println("abc");
	}
	public void empId() {
		System.out.println(25);
		
	}
	public void empLoc() {
		System.out.println("pune");
		
	}
	public static void main(String[] args) {
		empdetails emp=new empdetails();
		emp.empname();
		emp.empId();
		emp.empLoc();
		
		coursedetails  cou= new coursedetails();
		cou.javaCourse();
		cou.oracleCourse();
		cou.seleniumCourse();
		
	}
}
