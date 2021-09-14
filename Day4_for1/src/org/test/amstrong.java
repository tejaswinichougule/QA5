package org.test;

public class amstrong {

	public static void main(String[] args) {
		int no=153,onum,rem,res=0;
		onum=no;
		while(onum!=0) {
			rem=onum%10;
			res+=Math.pow(rem,3);
			onum/=10;
			
		}
		if(res==no)
			System.out.println(no+ "is amstrong");
		else {
			System.out.println(no+"is not amstrong");
		}
	}
}
