package org.stat;

//final keyword @class level
public  final class accesssp {
	
	static  int a=10,b=20;
	
	// final keyword @method level
	public final void  add() {
		int c;
		c=a+b;
		System.out.println(c);
		
	}
	
	private void sub() {
		//final key at var level
		 final int  d=10;
		//d=20;
		System.out.println(d);
	}
	public static void main(String[] args) {
		
		accesssp sp=new accesssp();
		sp.add();
		sp.sub();
	}
	
	//
	
	
		
	}

