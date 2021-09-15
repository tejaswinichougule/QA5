package org.test;
import java.util.Scanner;

public class disp_dig {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		System.out.println("ent the no1");
		int num=sc.nextInt();
		
		while(num!=0) {
			num=num/10;
			cnt++;
			
		}
		System.out.println("count of no"+cnt);
		
		
		
	}
	
	

}
