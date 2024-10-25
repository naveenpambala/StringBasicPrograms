package com.naveen.string;

public class CheckThe2StringsEqualOrNot {

	public static void main(String[] args) {

		String str1 = "Coding";
		String str2 = "Coding";

		boolean areEqual = true;

		// Check if lengths are equal
		if (str1.length() != str2.length()) {
			areEqual = false;
		} else {

			// Compare each character
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					areEqual = false;
					break;
				}
			}
		}

		if (areEqual) {
			System.out.println("The strings are equal.");
		} else {
			System.out.println("The strings are not equal.");
		}

	}

}
