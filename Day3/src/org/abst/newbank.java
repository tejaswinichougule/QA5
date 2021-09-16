package org.abst;


public class newbank implements I1,I2 {

	public void  eduloan() {
		System.out.println("8%");
	}

public void homeloan() {
	System.out.println("9%");
	
}

public void empname() {
	System.out.println("java");
	
}
public void empid() {
	System.out.println(25);

}
public void emploc() {
	System.out.println("india");

}
public static void main(String[] args) {
   newbank nb =new newbank();
	nb.eduloan();
	nb.homeloan();
	
	nb.empname();
	nb.empid();
	nb.emploc();
	
	//nb.empstatus();
	
	// 	OVERRIDE
	//public void empstatus()
	//{
		//System.out.println("false");
		//}

}

}


