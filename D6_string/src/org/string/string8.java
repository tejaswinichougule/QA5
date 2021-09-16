package org.string;
import java.util.Scanner;

public class string8 {
		public static void main(String[] args) {
					
			Scanner sc=new Scanner(System.in);
			
			System.out.println("ent the string 1");
			String s1=sc.next();
			System.out.println("string is->"+s1);
			
			System.out.println("ent the string 2");
			String s2=sc.next();
			System.out.println("string is->"+s2);

			// check equal or not using equalignore cae
			
			boolean sa=s1.equalsIgnoreCase(s2);
			System.out.println(sa);
			
		}
		

	}

