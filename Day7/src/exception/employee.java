
package exception;

public class employee {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
/*try {
	//String s=null;
	//System.out.println(s.length());
	System.out.println(4/0);
}
catch(ArithmeticException e ) {
	System.out.println("catch block");
}
	catch(NullPointerException e) {
		System.out.println("null catch blk");
	}
	
  catch(Throwable e){
	  System.out.println("throwable catch blk");
	  e.printStackTrace();
	  String msg=e.getMessage();
	  System.out.println(msg);
	
}
 finally {
	 System.out.println("finally block");
	 System.out.println(5);*/
		
		// MULTIPLE   CATCH AND FINALLY
		
		try {
			System.out.println(4);
			System.out.println("outer try blk");
			
			
			//inner try
			try {
				System.out.println("inner try blk");
		}
			
			//innercatch
			catch(ArithmeticException e ) {
				System.out.println("catch block");
			}
			
			//inner finalli
			finally {
				 System.out.println("inner finally");
 }
		
	}
		
		// outer catch
		 catch(Throwable e){
			  System.out.println("outer catch blk");
		 }
		
		// outer finally
		finally {
			 System.out.println("outer finally");
			 System.out.println(5);
}
		
	}		  

}
