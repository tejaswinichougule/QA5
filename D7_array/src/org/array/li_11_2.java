package org.array;

import java.util.ArrayList;
import java.util.List;

public class li_11_2 {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		List<Integer> li1=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10); 
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		li1.add(10);
		li1.add(20);
		li1.add(60);
		li1.add(50);
		li1.add(40);
		li1.add(70);
		li1.add(80);
		li1.add(90);
		System.out.println(li1);
		// remove all
		li.removeAll(li);
		System.out.println(li);
		
		
		li1.removeAll(li1);
	System.out.println(li1);
		
		
		
	}		
}
