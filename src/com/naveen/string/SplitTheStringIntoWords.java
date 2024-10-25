package com.naveen.string;

public class SplitTheStringIntoWords {

	public static void main(String[] args) {

		String s = "This is core java test";

		StringBuilder word = new StringBuilder();// used to store the words

		int wordcount = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ') {
				wordcount++;
				if (word.length() > 0) { // Avoid printing empty words
					System.out.println(word.toString());
					word = new StringBuilder(); // Reset for the next word
				}

			} else {
				word.append(s.charAt(i)); // Add characters to form a word
			}

		}
		// Print the last word if the string does not end with a space
		if (word.length() > 0) {
			System.out.println(word.toString());
		}
		System.out.println("wordcount is " + (wordcount + 1));

	}

}
