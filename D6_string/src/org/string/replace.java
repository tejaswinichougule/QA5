package org.string;
import java.util.Scanner;
public class replace {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("ent string");
			String st=sc.next();
			System.out.println(st.replaceAll("[aaEeIiOoUu]", "@"));
			
		}
	}
			


