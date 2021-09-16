package org.string;

public class conandvow {

	public static void main(String[] args) {
		
	
	String s1="welcome";
	int ccnt=0,vcnt=0;
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vcnt++;
		}
		else if(ch>='a'&& ch<='z') {
			ccnt++;
			
		}
		}
	System.out.println("no of vowels->"+vcnt);
	System.out.println("no of const->"+ccnt);
	}

}
