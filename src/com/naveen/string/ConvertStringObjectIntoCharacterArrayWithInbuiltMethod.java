package com.naveen.string;

public class ConvertStringObjectIntoCharacterArrayWithInbuiltMethod {

	public static void main(String[] args) {
		
//	  String class providing toCharArray() method for this conversion
		 
		String s="Coding";
		char[] ch=s.toCharArray();
		 
		for(char c : ch) {
			System.out.print(c+" ");
		}
		

	}

}
