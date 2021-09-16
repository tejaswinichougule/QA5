package org.excep;

public class coursedetails {
	
	public static void main(String[] args) throws empNotFoundexception, ArithmeticException {
		String env="down";
		if(env.equals("down")) {
			throw new  empNotFoundexception();
		}
		
	}

}
