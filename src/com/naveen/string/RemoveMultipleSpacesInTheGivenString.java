package com.naveen.string;

public class RemoveMultipleSpacesInTheGivenString {

	public static void main(String[] args) {

		String s = "This is a String";

		s = s.replaceAll("\\s+", " ");

		System.out.println(s);

	}

}
