package org.string;

import java.util.ArrayList;
import java.util.List;

public class l3 {
	public static void main(String[] args) {
		List <Integer>li=new ArrayList<Integer>();
		List <Integer>li1=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		//second list
		li1.add(30);
		li1.add(40);
		li1.add(50);
		li1.add(60);
		li1.add(80);
		
		System.out.println(li1);
		
		li.retainAll(li1);
		System.out.println(li);
	
	}
}
