package org.test;

public class A_1 {
	public A_1() {
		this("Java");
		System.out.println("default const");
		}
	public A_1(int id) {
		this(3456.5678f);
		System.out.println(id);
	}
	
	public A_1(String name) {
		this(12);
		System.out.println(name);
	}
	
	public A_1(float sal)
	{
		System.out.println(sal);
	}
	public static void main(String[] args) {
		 A_1 a=new A_1();
	}
}
