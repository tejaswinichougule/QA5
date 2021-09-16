package org.string;

public class string_op {
		
		public static void main(String[] args) {
			String s="Selenium";
			String as="selenium";
			
			//charAT
				char a=s.charAt(3);
				System.out.println(a);
				
				//toUPPERCASE
				String up=s.toUpperCase();
				System.out.println(up);
				
				
				//toLoweCase;
				String lc=s.toLowerCase();
				System.out.println(lc);
				
				//startwith
				boolean sw=s.startsWith("s");
				System.out.println(sw);
				
				//endswith
				boolean ew=s.endsWith("ewj");
				System.out.println(ew);
				
				// CONTAINS
				boolean cn=s.contains("n");
				System.out.println(cn);
				
				// LENGTH
				int len=s.length();
				System.out.println(len);
				
				// INDEXOF
				 int io=s.indexOf("e");
				 System.out.println(io);
				 
				 //lastindexof
				 int lo=s.lastIndexOf("e");
				 System.out.println(lo);
				 
				 //REPLACE
				 String re=s.replace("e","a");
				 System.out.println(re);
				 
				 //relaceAll
				 String ra=s.replaceAll("selenium","java");
				 System.out.println(ra);
				 
				 // equals
				 boolean eq=s.equals(as);
				 System.out.println(eq);
				 
				 // equallisignorecase
				 
				 boolean aq=s.equalsIgnoreCase(as);
				 System.out.println(aq);
				 
				 String cc=s.concat(as);
				 System.out.println(cc);
				 
				 //trim
				 String ss="welcome to java";
				 String tr=ss.trim();
				 System.out.println(ss);
				 System.out.println(tr);
				 
				 //isEmpty
				 String c=" ";
				 boolean em=c.isEmpty();
				 System.out.println(em);
				 
				 // substring
				 String su=s.substring(2);
				 System.out.println(su);
				 
				 // n-1 (7-1==6)
				 String sub=s.substring(2,7);
				 System.out.println(sub);
				 
				 
		}

	}

