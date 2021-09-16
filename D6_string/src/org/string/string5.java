package org.string;

public class string5 {

	public static void main(String[] args) {
		
		String s1="welcome to java class";
		String s2="chenni adayar";
		String s3="java";
		String s4="java";
		
		String s5="nia";
		String s6="nisha";
		
		
		//REPLACE THE JAVA INTO SQL
		
		String re=s1.replace("java", "sql");
		System.out.println(re);
		
		String re1=s2.replace("adayar","omr");
		System.out.println(re1);
		
		String ra=s1.replaceAll(" ","#");
		System.out.println(ra);
		
		// COMPARE TWO STRING
		 boolean eq=s3.equals(s4);
		 System.out.println(eq);
		 
		 // COMPARE
		 boolean aq=s5.equals(s6);
		 System.out.println(aq);
		 
		 // GENETARE SUBSTRING
		 String s7="welcome to java class";
		 String sa=s7.substring(0,7);
		 System.out.println(sa);
		
		
	}
}
