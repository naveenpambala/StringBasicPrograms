package com.naveen.string;

public class RemoveSpacesInString {

	public static void main(String[] args) {

		String s = "This is a String";

		s = s.replaceAll(" ", "");
		
		System.out.println(s);
	}

}
