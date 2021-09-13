package org.college;

public class dept  extends student {

	public void depname() {
		System.out.println("compp");
		
	}
	public static void main(String[] args) {
		
		dept d=new dept();
		d.depname();
		
		/*student st=new student();
		st.stname();
		st.stid();
		st.stdept();*/
		
		d.collname();
		d.stid();
	}
}
