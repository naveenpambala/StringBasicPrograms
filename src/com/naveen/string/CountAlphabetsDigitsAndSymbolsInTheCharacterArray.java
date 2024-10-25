package com.naveen.string;

public class CountAlphabetsDigitsAndSymbolsInTheCharacterArray {

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', '@', '1', '2', '3' };

		int alpha = 0;
		int digits = 0;
		int symbols = 0;

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				alpha++;
			} else if (ch >= '0' && ch <= '9') {
				digits++;
			} else {
				symbols++;
			}

		}
		System.out.println("Alphabets : " + alpha);
		System.out.println("Digits : " + digits);
		System.out.println("Symbols : " + symbols);

	}

}
