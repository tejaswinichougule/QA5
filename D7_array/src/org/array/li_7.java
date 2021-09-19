package org.array;

import java.util.ArrayList;
import java.util.List;

public class li_7 {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		
		System.out.println(li);
		
		// remove 2 index
		int sa=li.remove(2);
		System.out.println(li);
	}
}
