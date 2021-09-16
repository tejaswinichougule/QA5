package org.string;
import java.util.Scanner;



public class string4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ent the phno");
		String phone=sc.next();
		
	// EXPRESSION TO ACCEPT VALID PHNO
		String regex="\\d{10}";
		
		// MATCH THE GIVEN PHNO
		boolean res=phone.matches(regex);
		if(res) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		
		
	}
		
}	

