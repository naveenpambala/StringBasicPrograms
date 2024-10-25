package com.naveen.string;

import java.util.Arrays;

public class ConvertStringObjectIntoCharacterArray {

	public static void main(String[] args) {
		 
		String s = "Coding";
		
		char[] charArray = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			charArray[i]=s.charAt(i);
			
		}
		//Use This or
//		 for (int i = 0; i < charArray.length; i++) {
//			 System.out.print(charArray[i]+" ");
//		}
		//This single line As your wish
		 System.out.print(Arrays.toString(charArray));

		 


	}

}
