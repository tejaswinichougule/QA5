package org.string;

public class string7 {


	
	public static void main(String[] args) {
		
		// LITERAL sTRING
		
		String a="Nisha";
		String b="Nisha";
		System.out.println("************ literal String*****************");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		// NON LITERAL STRING
		String c=new String("Nisha");
		String d=new String("Nisha");
		System.out.println("**************** non-literal string************");
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		// NON-LITERAL STRING
		String e=new String("nisha");
		String f=new String("rengan");
		String g=new String("Nisharengan");
		System.out.println("********** non-literal string**************");
		System.out.println(System.identityHashCode(e));
		System.out.println(System.identityHashCode(f));
		System.out.println(System.identityHashCode(g));
		
		// LITERAL STRING
		String h="nisha";
		String i="rengan";
		String j="nisharengan";
		System.out.println("*****************literal string***********");
		System.out.println(System.identityHashCode(h));
		System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(j));
		
	}
	
	

}
