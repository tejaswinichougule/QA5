package org.array;

public class arr_1_2 {
	
	public static void main(String[] args) {
		int num[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		int num1[]=new int[] {10,10,20,50,60,80,60,50};
		int sum=0,avg=0;
		int len=num.length;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
			
		}
		// AVERAGE 
		 avg=sum/len;
		System.out.println("sum is"+sum);
		System.out.println("avg is"+avg);
		System.out.println(len);
	}


}
