package org.array;

import java.util.ArrayList;
import java.util.List;

public class li_9_3 {
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
		li.add(30);
		
		System.out.println(li);
		
		li.set(0,100);
		System.out.println(li);
}		

}
