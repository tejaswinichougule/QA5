package org.string;

public class array {
	
public static void main(String[] args) {
			
			int num[]=new int[5];
			num[0]=10;
			num[1]=20;
			num[2]=30;
			num[3]=40;
			num[4]=50;
			
			System.out.println(num[1]);
			//System.out.println(num[4]);
			
			// length
			int len=num.length;
			System.out.println(len);
			
			// iterate
			for(int i=0;i<num.length;i++)
				System.out.println(num[i]);
			
			for(int x:num)
				System.out.println(x);
			
		}

	}



