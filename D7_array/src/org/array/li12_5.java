package org.array;

import java.util.ArrayList;
import java.util.List;

public class li12_5 {
public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(10);
		
		System.out.println(li);
		
		// get first index of 10
		int fo=li.indexOf(10);
		System.out.println(fo);
		
		//get last index of 10
		int lo=li.lastIndexOf(10);
		System.out.println(lo);
		
		// index of 50
		int ao=li.indexOf(50);
		System.out.println(ao);
		
		//index of 90
		int so=li.indexOf(90);
		System.out.println(so);
		
		// get each index val of 10
	
		int a1=li.indexOf(10);
		System.out.println(a1);
		
		int a2=li.lastIndexOf(10);
		System.out.println(a2);
		

}
}