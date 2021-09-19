package org.array;

import java.util.ArrayList;
import java.util.List;

public class li_10_2 {
	
	public static void main(String[] args) {
		List <Integer>li=new ArrayList<Integer>();
		List <Integer>li1=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		System.out.println(li);
		
		li1.add(100);
		li1.add(200);
		li1.add(300);
		li1.add(400);
		li1.add(500);
		li1.add(600);
		li1.add(700);
		li1.add(800);
		System.out.println(li1);
		
		li.retainAll(li1);
		System.out.println(li);
	
	}

	}




