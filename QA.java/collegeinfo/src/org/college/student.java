package org.college;

public class student extends college {

	public void stname() {
		System.out.println("abc");
	}
	
	public void stdept() {
		System.out.println("cs");
	}
	
	public void stid() {
		System.out.println(12);
		
	}
	public static void main(String[] args) {
		
		student st=new student();
		st.stname();
		st.stid();
		st.stdept();
		
		st.collname();
		st.collcode();
		st.collrank();
		
		
	}
}

