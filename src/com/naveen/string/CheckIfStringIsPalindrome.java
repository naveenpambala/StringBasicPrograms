package com.naveen.string;

public class CheckIfStringIsPalindrome {

	public static void main(String[] args) {

		String str = "madam";

		String revrstr = "";

		boolean isPalindrome = true;

		for (int i = str.length() - 1; i >= 0; i--) {
			revrstr = revrstr + str.charAt(i);

		}

		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) != revrstr.charAt(j)) {
				isPalindrome = false;
				break;
			}

		}

		if (isPalindrome) {
			System.out.println("Given String is Palindrome");

		} else {
			System.out.println("Given String is NOT Palindrome");
		}

	}

}
