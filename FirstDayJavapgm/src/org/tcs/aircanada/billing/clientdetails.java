package org.tcs.aircanada.billing;
import com.cts.delta.login.*;

//import com.cts.delta.login.coursedetails;
//import com.cts.delta.login.empdetails;

public class clientdetails {
	private void  cliname() {
		System.out.println("pqr");
		
	}
	private void  cliLoc() {
		System.out.println("pune");
	}
	public static void main(String[] args) {
		clientdetails cl=new clientdetails();
		cl.cliname();
		cl.cliLoc();
		
		coursedetails cou=new coursedetails();
		cou.javaCourse();
		cou.oracleCourse();
		cou.seleniumCourse();
		
		empdetails em=new empdetails();
		em.empname();
		em.empId();
}

}
