package org.test;

public class A {
	
	public A() {
		this("Java");
		System.out.println("default const");
		}
	public A(int id) {
		this(3456.5678f);
		System.out.println(id);
	}
	
	public A(String name) {
		this(12);
		System.out.println(name);
	}
	
	public A(float sal)
	{
		System.out.println(sal);
	}
	public static void main(String[] args) {
		 A a=new A();
	}
	
	

}
