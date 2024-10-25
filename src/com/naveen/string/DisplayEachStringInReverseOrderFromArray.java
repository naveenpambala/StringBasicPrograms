package com.naveen.string;

public class DisplayEachStringInReverseOrderFromArray {

	public static void main(String[] args) {

		String[] arr = { "java", "jsp", "servlets", "hibernate", "springBoot" };

		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			for (int j = s.length() - 1; j >= 0; j--) {
				System.out.print(s.charAt(j) + " ");

			}
			System.out.println();

		}
	}

}
