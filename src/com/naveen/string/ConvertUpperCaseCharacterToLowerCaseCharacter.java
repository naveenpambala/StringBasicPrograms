package com.naveen.string;

import java.util.Scanner;

public class ConvertUpperCaseCharacterToLowerCaseCharacter {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a UpperCaseCharacter");
		char ch = sc.next().charAt(0);
		
		if (ch>='A' && ch<='Z') {
			
			ch=(char) (ch+32);
			System.out.println(ch);
			
		} else {
			System.out.println("Please Enter Uppercase Charecter");
		}
		

	}

}
