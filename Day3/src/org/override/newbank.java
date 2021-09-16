package org.override;

public class newbank  extends RBI{
	
	public  void eduloan() {
		System.out.println("9%");
	}
	
	public  void homeloan() {
		System.out.println("6%");
		
	}
	
	// override
	public void savingacc() {
		System.out.println("10%");
		
	}
	
	// override
	
	public void checkingacc() {
		System.out.println("11%");
		
	}
	
	public static void main(String[] args) {
		newbank ne=new newbank();
		ne.eduloan();
		ne.homeloan();
		
		ne.savingacc();
		ne.checkingacc();
		ne.jointacc();
		
	}

}
