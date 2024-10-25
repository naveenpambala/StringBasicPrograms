package com.naveen.string;

public class CountNumberOfWordsInTheGivenStringWithoutSplitMethod {

	public static void main(String[] args) {

		String s = "This is core java test";
		int spacecount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				spacecount++;
			}

		}

		System.out.println("Word Count  " + (spacecount + 1));

	}

}
