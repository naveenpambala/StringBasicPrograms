package com.naveen.string;

public class PrintTheStringInReverseOrder {

	public static void main(String[] args) {

		String s = "Coding";

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));

		}

	}

}
