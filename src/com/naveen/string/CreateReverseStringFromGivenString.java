package com.naveen.string;

public class CreateReverseStringFromGivenString {

	public static void main(String[] args) {
		 
		String str = "Coding";
		
		String revrstr="";
		for(int i=str.length()-1;i>=0 ;i-- ) {
			revrstr=revrstr+str.charAt(i);
			
		}
		System.out.println(revrstr );
	}

}
