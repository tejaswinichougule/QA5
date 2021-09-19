package org.array;

import java.util.ArrayList;
import java.util.List;

public class li_7_2 {
	
public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		
		System.out.println(li);
		
		//remove the val present in list
		
		int la=li.lastIndexOf(10);
		System.out.println(li);
}
}
