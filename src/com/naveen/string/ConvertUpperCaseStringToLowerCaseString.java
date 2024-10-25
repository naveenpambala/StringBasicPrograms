package com.naveen.string;

public class ConvertUpperCaseStringToLowerCaseString {

	public static void main(String[] args) {
 
		String s = "CoDiNg@365";
		String lowercasestr="";
		
		for (int i = 0; i <  s.length(); i++) {
			
			char ch =s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				lowercasestr+=(char)(ch+32);
			}else {
				lowercasestr+=ch;
			}
			
		}
		System.out.println(lowercasestr);
	}

}
