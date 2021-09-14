package org.lang;

public class langinfo {
	
public void tamillan() {
	System.out.println("tamil");
}

public void englan() {
	System.out.println("english");
}

public void hindilan() {
	System.out.println("hindi");	
}

public static void main(String[] args) {
	
	langinfo ln=new langinfo();
	ln.tamillan();
	ln.englan();
	ln.hindilan();
}
}
