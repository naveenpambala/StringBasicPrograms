package com.naveen.string;

import java.util.Arrays;

public class CheckTwoStringsAreAnagramsOrNot {

	public static void main(String[] args) {

		// We can say if two strings are an anagram of each other if they contain the
		// same
		// characters but at different orders. For example, army & mary

		String s1 = "listen";
		String s2 = "silent ";

		boolean flag = true;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);

		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i])
				flag = false;
			break;
		}
		if (flag) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}

	}

}
