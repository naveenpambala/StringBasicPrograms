package com.naveen.string;

public class DisplayTheASCIIValuesOfCharactersInThEgivenString {

	public static void main(String[] args) {
		
		String s = "Coding";
		//A= 65  a=97
		//Z =90  z=122
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch =s.charAt(i);
			System.out.println(ch +"="+(int) ch);
			
			
		}
		

	}

}
