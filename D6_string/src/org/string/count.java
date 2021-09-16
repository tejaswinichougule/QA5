package org.string;

public class count {
	
	public static void main(String[] args) {
		int cap=0,small=0,no=0,schar=0;
		String s1="Wlcome To Java Class @123";
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>'A'&& ch<='Z') {
				//check upper case
				cap++;
			}
			else if(ch>='a'&&ch<='z') {
				// check lower case
				small++;
			}
			else if(ch>='0'&& ch<='9') {
				// check number
				no++;
			}
			else {
				schar++;
			}
			
		}
		System.out.println("cap is->"+cap);
		System.out.println("small is->"+small);
		System.out.println("no is->"+no);
		System.out.println("schar is->"+schar);
	}

}
