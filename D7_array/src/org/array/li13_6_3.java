package org.array;

import java.util.ArrayList;
import java.util.List;

public class li13_6_3 {
	
	public static void main(String[] args) {
		List<Integer> li2=new ArrayList<Integer>();

		
		// EXAMPLE 2
		li2.add(105);
		li2.add(205);
		li2.add(305);
		li2.add(405);
		li2.add(505);
		li2.add(605);
		li2.add(705);
		li2.add(805);
		
		//System.out.println(li2);
		
	  // find 8th index
		int ya=li2.get(8);
		System.out.println(ya);
		
		// use normal for loop
		for(int i=0;i<li2.size();i++) {
			System.out.println(li2.get(i));}
		
		// enhanced for loop
		
		for(Integer x:li2) {
			System.out.println(x);
			
		}
		}
	}

