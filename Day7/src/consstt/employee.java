package consstt;

public class employee {
	
	public employee() {
		this(24);
		System.out.println("default const");
	}
	
	public employee(int age) {
		this("selenium");
		System.out.println(age);
	}
	public employee(String name){
		this(67.67f);
		System.out.println(name);
	}
	
	 public employee(float avg) {
		 
		 System.out.println(avg);
	 }
	 public static void main(String[] args) {
		
		/* employee e1=new employee();
		 employee e2=new employee(25);
		 employee e3=new employee("java");
		 employee e4= new employee(23.45f);
		 */
		 
		 // USING SINGLE BJECT
		 employee e1=new employee();
	}
}
