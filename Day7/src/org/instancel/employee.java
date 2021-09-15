package org.instancel;

public class employee {
	
	// instance var @class level  or global var
	int a=10,b=20;
	private void add() {
		int c;
		c=a+b;
		System.out.println(c);
			
	}
	
	private void sub() {
		int d=b-a;
		System.out.println(d);
	}
	public static void main(String[] args) {
		employee e=new employee();
		e.add();
		e.sub();
	}

}
