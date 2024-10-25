package com.naveen.string;

public class CheckHowManyTimesTheGivenSubStringIsPresent {

	public static void main(String[] args) {

		String s = "abcaabcaaabcabacabcaabcaabc";

		String[] arr = s.split("abc");

		System.out.println("SubString Is Present " + (arr.length) + " times");

	}

}
