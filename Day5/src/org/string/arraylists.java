package org.string;
import java.util.ArrayList;
import java.util.List;


public class arraylists {

		public static void main(String[] args) {
			
			List <Integer> li=new ArrayList<Integer>();
			
			List <Integer> l1=new ArrayList<Integer>();
			
			li.add(10);
			li.add(20);
			li.add(30);
			li.add(40);
			li.add(50);
			
			System.out.println(li);
			
			//to copy all val from one list to another
			l1.addAll(li);
			System.out.println(l1);
			
			l1.add(1000);
			System.out.println(l1);
	System.out.println(li);

	//to remove common val
	l1.remove(li);
	System.out.println(li);

	// to retain the common val
	li.retainAll(li);
	System.out.println(li);

	// for loop
	for(int i=0;i<li.size();i++) {
		System.out.println(li.get(i));
		
		/*for(integer x:l1);
		System.out.println(x);*/
		
		
	}
		
		}

	}


