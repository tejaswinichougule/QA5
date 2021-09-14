package org.bank;

public class axisBank  extends bankinfo{
	
	public  void deposit() {
		System.out.println("deposit");
	}
	
	public static void main(String[] args) {
		
		axisBank ab=new axisBank();
		ab.deposit();
		
		ab.saving();
		ab.fixed();
		
	}

}
