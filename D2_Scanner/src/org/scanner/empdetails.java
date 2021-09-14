package org.scanner;

import java.util.Scanner;

public class empdetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// EMPID
		System.out.println("ent ur empid" );
		long  em=sc.nextLong();
		System.out.println("emp id is"+em);
		
		// EMPNAME
		System.out.println("ent ur name");
		String na=sc.next();
		System.out.println("name is:"+na);
		
		//EMPMAIL
		System.out.println("ent ur mail");
		String emm=sc.next();
		System.out.println("mail is"+emm);
		
		//EMPPHNO
		System.out.println("ent ur ph no");
		long ph=sc.nextLong();
		System.out.println("ph no is"+ph);
		
		//EMPSAL
		System.out.println("ent ur sal");
		long sl=sc.nextLong();
		System.out.println("sal is"+sl);
		
		//EMPGENDER
		System.out.println("ent ur gender");
		String gn=sc.next();
		System.out.println("gen is"+gn);
		
		//EMPCITY
		System.out.println("ent ur city");
		String ct=sc.next();
		System.out.println("city is"+ct);
	}

}



