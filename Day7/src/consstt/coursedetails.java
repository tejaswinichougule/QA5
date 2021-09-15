package consstt;
import consstt.employee;

public class coursedetails extends employee {
	public coursedetails() {
		super();
		System.out.println("child default const");
	}
	
	public coursedetails(int val) {
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		coursedetails cs=new coursedetails();
		coursedetails cs1=new coursedetails(1000);
	}

}
