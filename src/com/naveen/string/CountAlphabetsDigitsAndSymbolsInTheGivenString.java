package com.naveen.string;

public class CountAlphabetsDigitsAndSymbolsInTheGivenString {

	public static void main(String[] args) {

		String s = "Codinga#@3651";

		int alpha = 0;
		int digits = 0;
		int symbol = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				alpha++;
			} else if (ch >= '0' && ch <= '9') {
				digits++;

			} else {
				symbol++;
			}

		}
		System.out.println("Alphabets " + alpha);
		System.out.println("Digits " + digits);
		System.out.println("Symbols " + symbol);

	}

}
