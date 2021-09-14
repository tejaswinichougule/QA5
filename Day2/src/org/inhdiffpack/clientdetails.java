package org.inhdiffpack;

import org.inh.empdetails;

public class clientdetails  extends empdetails{
	
public void cliId() {
	
	System.out.println(1);
	}

public void cliname() {
	System.out.println("tej");
}

public static void main(String[] args) {
	
	clientdetails cl=new clientdetails();
	cl.cliId();
	cl.cliname();
	
	cl.empname();
	cl.empid();
	cl.emploc();
	
	cl.javacourse();
	cl.seleniumcourse();
}
}
