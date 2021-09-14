package org.scanner;

import java.util.Scanner;

public class clientsdetails {
	
public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			// NEXTLINE - CTRL+2 L
			
			System.out.println("ent ur name");
			String nel=sc.nextLine();
			System.out.println("your name is :"+nel);
			
			//NEXT
			System.out.println("ent ur first name");
			String ne=sc.next();
			System.out.println("first name is: "+ne);
			
			// NEXTLONG
			System.out.println("ent ut ph no");
			long nl=sc.nextLong();
			System.out.println("ph no is:"+nl);
			
			//NEXTFLOAT
			System.out.println("ent avg val");
			float  av=sc.nextFloat();
			System.out.println("avg val:"+av);
			
			// NEXTDOUBLE
			System.out.println("ent sal val");
			double sl=sc.nextDouble();
			System.out.println("sal val is :"+sl);
			
			//next booolean
			System.out.println("ent emp status");
			boolean em=sc.nextBoolean();
			System.out.println("emp status is"+em);
		}
		
		

	}


