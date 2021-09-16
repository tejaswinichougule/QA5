package org.string;
import java.util.Scanner;

public class String3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ent the string 1");
		String s1=sc.next();
		System.out.println("string is->"+s1);
		
		System.out.println("ent the string 2");
		String s2=sc.next();
		System.out.println("string is->"+s2);

		// check equal or not
		 boolean eq=s1.equals(s2);
		 System.out.println(eq);
		 
		
	}
	

}
