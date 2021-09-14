package org.inh;


public class clientsdetails extends empdetails {
			private void cliname() {
				System.out.println("air");
			}
			
			private void cliId() {
				System.out.println(5);
				
			}
			
			public static void main(String[] args) {
				
				clientsdetails cl=new clientsdetails() ;
				cl.cliname();
				cl.cliId();
				
				cl.empname();
				cl.empid();
				
			}
				
			}