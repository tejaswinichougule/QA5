package exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class coursedetails  {

	public static void main(String[] args) {
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4/0);
		System.out.println(5);
		*/
		
		//NULL PTR/
		
		/*String s=null;
		int len=s.length();
		System.out.println(len);*/
		
		// string index outof bound
		/*String s="selenium";
		char ca=s.charAt(25);
		System.out.println(ca);*/
		
		// ARRAY INDEXOUTOF BOUND
		/*int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[30]);*/
		
		// INDEX OUTOF BOUND
	  /*List<Integer>li=new ArrayList<Integer>();
	  li.add(10);
	  li.add(20);
	  li.add(30);
	  li.add(40);
	  System.out.println(li.get(25));*/
	  
	  //INPUT MISMATCH
	/*  Scanner sc=new Scanner(System.in);
	  int ni=sc.nextInt();
	  System.out.println(ni);*/
		
		//NUMBER FROMAT 
		String s ="1234";
	int 	pi=Integer.parseInt(s);
		System.out.println(pi);
		
	}
}
