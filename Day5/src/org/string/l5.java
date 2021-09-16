package org.string;

import java.util.ArrayList;
import java.util.List;

public class l5 {

	public static void main(String[] args) {
		
		List <Integer>l2=new ArrayList<Integer>();
		List <Integer>li1=new ArrayList<Integer>();
		
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
		 
		 li1.add(30);
			li1.add(40);
			li1.add(50);
			li1.add(60);
			li1.add(80);
			
			System.out.println(li1);
			
			li1.removeAll(li1);
			System.out.println(li1);
			
			l2.removeAll(l2);
			System.out.println(l2);
			
	}
}
