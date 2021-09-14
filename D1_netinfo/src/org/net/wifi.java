package org.net;

public class wifi {
	public void wifiname() {
		System.out.println("wifi");
	}
	
	public static void main(String[] args) {
		wifi wi=new wifi();
		wi.wifiname();
		
		mobdata mb=new mobdata();
		mb.dataname();
		
		lan ln=new lan();
		ln.lanname();
		
		wireless wr=new wireless();
		wr.modname();
	}

}
