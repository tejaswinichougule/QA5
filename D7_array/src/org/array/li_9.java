package org.array;

import java.util.ArrayList;
import java.util.List;

public class li_9 {

	public static void main(String[] args) {
		 List <Integer> li=new ArrayList<Integer>();
		
		 
		 
		 li.add(100);
		 li.add(200);
		 li.add(300);
		 li.add(400);
		 li.add(500);
		 li.add(600);
		 System.out.println(li);
		 
		 // replace 300 into 350
			li.set(2, 350);
			 System.out.println(li);
}
}

