package com.naveen.string;

import java.util.Scanner;

public class CheckTheCharacterIsSpecialSymbolOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Charecter");
		char ch = sc.next().charAt(0);

		if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')) {

			System.out.println(ch + " is SpecialSymbol");
		} else {
			System.out.println(ch + " is Not SpecialSymbol");
		}

	}

}
