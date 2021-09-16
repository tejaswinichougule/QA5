package org.string;
import java.util.Scanner;

public class string6 {

	public static void main(String[] args) {
		
		System.out.println("ent mail id");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		
		// pincode
		System.out.println("ent add");
		String re=sc.next();
		System.out.println(re);
		
		// replace "gmail" into "yahoo"
		String s1=st.replace("gmail", "yahoo");
		System.out.println(s1);
		
		String re1=re.replace("pincode"," ");
		System.out.println(re);
		
		
		
	}
}
