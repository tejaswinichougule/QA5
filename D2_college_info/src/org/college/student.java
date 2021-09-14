package org.college;
import org.college.college;

public class student extends college {

	public void stname() {
		
		System.out.println("abc");
	}
	
	public void stdept() {
		
		System.out.println("cs");
	}
	
	public void stid() {
		System.out.println(1);	
	}
	
	public static void main(String[] args) {
		
		student st=new student();
		st.stname();
		st.stdept();
		st.stid();
		
		st.clgname();
		st.clgcode();
		st.clgrank();
	}
}
