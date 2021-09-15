package org.stat;

public class staticc {

	
	//satic keyword  @var level
	static int a=10,b=20;
	
	// static keyword @method level
	public static void add() {
		int c=a+b;
		System.out.println(c);
	}
	
	private void sub() {
		int c;
		c=b-a;
		System.out.println(c);
	}
	
	// static keyword W@constructor level
	static staticc stt;
	
	public static void main(String[] args) {
		add();
		staticc.add();
		
		stt=
				new staticc();
		stt.sub();
		
	}
}

