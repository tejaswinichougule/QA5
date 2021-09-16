package org.abst;


	public class abst_newbank  extends abst_RBI{
		
		public  void eduloan() {
			System.out.println("9%");
		}
		
		public  void homeloan() {
			System.out.println("6%");
		}
		
		// OVERRIDE
		public void jointacc() {
			System.out.println("15%");
		}
		public void creditcard() {
			System.out.println("20%");
			
		}
			
		public static void main(String[] args) {
			
			abst_newbank nb=new abst_newbank();
			nb.eduloan();
			nb.homeloan();
			
			nb.jointacc();
			nb.creditcard();
		}
		}


