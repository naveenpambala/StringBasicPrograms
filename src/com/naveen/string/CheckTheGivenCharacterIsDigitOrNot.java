package com.naveen.string;

import java.util.Scanner;

public class CheckTheGivenCharacterIsDigitOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Charecter");
		char ch = sc.next().charAt(0);
		if (ch >= '0' && ch <= '9') {

			System.out.println(ch + " is a Digit");

		} else {
			System.out.println(ch + " is not a Digit");

		}
	}

}
