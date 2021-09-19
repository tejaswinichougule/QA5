package org.array;

import java.util.ArrayList;
import java.util.List;

public class li_9_2 {
	public static void main(String[] args) {
		
		 List <Integer> l2=new ArrayList<Integer>();

	 l2.add(10);
	 l2.add(20);
	 l2.add(30);
	 l2.add(90);
	 l2.add(10); 
	 l2.add(10);
	 l2.add(40);
	 l2.add(50);
	 l2.add(10);
	 
	 System.out.println(l2);
	 
	 //replace  7th index as 90
	 
	 l2.set(7, 90);
	 System.out.println(l2);
	}	 

}
