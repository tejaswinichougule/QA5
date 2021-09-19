package org.array;

import java.util.ArrayList;
import java.util.List;

public class li13_6_2 {
	public static void main(String[] args) {

		List<Integer> li=new ArrayList<Integer>();

		 li.add(100);
		 li.add(200);
		 li.add(300);
		 li.add(400);
		 li.add(500);
		 li.add(600);
		 System.out.println(li);
		 
		 // get 4 th index
		 
		 int ac=li.get(4);
		 System.out.println(ac);
	}

}
