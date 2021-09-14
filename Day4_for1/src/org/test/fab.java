package org.test;

public class fab {
	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,cnt=100;
		
		System.out.println(n1+" "+n2);
		
		for(int i=2;i<cnt;i++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	

}
