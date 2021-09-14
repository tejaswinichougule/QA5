package org.college;
import org.college.student;

public class dept  extends student{

	public void depname() {
		
		System.out.println("comp");
		
	}
	public static void main(String[] args) {
		
		dept dt=new dept();
		dt.depname();
		
		dt.stname();
		dt.stdept();
		dt.stid();
		
		dt.clgname();
		dt.clgcode();
		dt.clgrank();
	}
}
