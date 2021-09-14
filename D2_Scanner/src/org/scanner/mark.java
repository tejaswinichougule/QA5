package org.scanner;

import java.util.Scanner;

public class mark {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// STID
		System.out.println("ent ur stpid" );
		long  st=sc.nextLong();
		System.out.println("emp id is"+st);
		
		//STNAME
		System.out.println("en ur name");
		String nm=sc.next();
		System.out.println("ur name"+nm);
		
		//MARK1
		System.out.println("ent mark1");
		long mk1=sc.nextLong();
		System.out.println("mark1 is"+mk1);
		
		//MARK2
		System.out.println("ent mark2");
		long mk2=sc.nextLong();
		System.out.println("mk2 is"+mk2);
		
		//MARK3
		System.out.println("ent ur mark3");
		long mk3=sc.nextLong();
		System.out.println("mk3 is"+mk3);
		
		//MARK4
		System.out.println("mark4 is");
		long mk4=sc.nextLong();
		System.out.println("mk4 is"+mk4);
		
		// MK5
		
		System.out.println("mark5 is");
		long mk5=sc.nextLong();
		System.out.println("mk5 is"+mk5);
		
		//TOTAL
		long tot=mk1+mk2+mk3+mk4+mk5;
		System.out.println("tot is->"+tot);
		
		//AVG
		long avg=tot/5;
		System.out.println("avg is->"+avg);
		
	}
}



