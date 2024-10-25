package com.naveen.string;

import java.util.Scanner;

public class CheckTheCharacterIsAlphabet0rNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Charecter");
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is Alphabet");

		} else {
			System.out.println(ch + " is not Alphabet");
		}

	}

}
