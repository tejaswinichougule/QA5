package org.string;

public class newbank {

	
	public static void main(String[] args) {
		
		
		//LITERAL STRING
		String a="selenium";
		String b="selenium";
		System.out.println("*************literal string ************");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		// NON LITERAL STRING
	  String c=new String("java");
	  String d=new String("java");
	  
	  System.out.println("**********non literal*******");
	  System.out.println(System.identityHashCode(c));
	  System.out.println(System.identityHashCode(d));
	  
	  //IMMUATBLE same as literal
	String e="API";
	String f="API";
	
	String co=e.concat(f);
	System.out.println("**********immuatble string*********");
	System.out.println(System.identityHashCode(e));
	System.out.println(System.identityHashCode(f));
	System.out.println(System.identityHashCode(co));
	
	// MUATABLE 
	//BUFFER
	StringBuffer g=new StringBuffer("AWS");
	StringBuffer h=new StringBuffer("AWS");
	StringBuffer app=g.append(h);
	System.out.println("**********mutuable ***********");
	System.out.println(System.identityHashCode(g));
	System.out.println(System.identityHashCode(h));
	System.out.println(System.identityHashCode(app));
	
	  
	// builder
	StringBuilder i=new StringBuilder("oracle");
	StringBuilder j=new StringBuilder("oracle");
	StringBuilder ap=i.append(j);
	System.out.println("**********mutuable ***********");
	System.out.println(System.identityHashCode(i));
	System.out.println(System.identityHashCode(j));
	System.out.println(System.identityHashCode(ap));
	
	}

}

