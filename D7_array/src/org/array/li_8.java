package org.array;

import java.util.ArrayList;
import java.util.List;

public class li_8 {
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
		
		System.out.println(li);
		
	// add 50 val in 2nd index
		li.add(2,50);
		System.out.println(li);
		
		//add 70 at end
		li.add(70);
		System.out.println(li);
		
		// add 80 of 8th index
				li.add(8,80);
				System.out.println(li);
				 
				// add 100 at last index
				li.add(100);
				System.out.println(li);
	}

}
