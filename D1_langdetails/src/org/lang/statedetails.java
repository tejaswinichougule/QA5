package org.lang;

public class statedetails {
	
	public void southindia() {
		System.out.println("south");
		
	}
	
	public void northindia() {
		
	System.out.println("north");
		
	}
	
	public static void main(String[] args) {
		
		statedetails st=new statedetails();
		st.southindia();
		st.northindia();
		
		langinfo ln=new langinfo();
		ln.tamillan();
		ln.englan();
		ln.hindilan();
	}
	}


