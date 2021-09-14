package org.college;
import org.college.dept;
public class hostel extends dept {
	
	public void hsname() {
		
		System.out.println("savitri");
		
	}
	
	public static void main(String[] args) {
		
		hostel ha=new hostel();
		ha.hsname();
		
		ha.depname();
		
		ha.stname();
		ha.stdept();
		ha.stid();
		
		ha.clgname();
		ha.clgcode();
		ha.clgrank();
	}

}
