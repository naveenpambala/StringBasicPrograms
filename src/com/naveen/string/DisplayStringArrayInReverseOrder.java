package com.naveen.string;

public class DisplayStringArrayInReverseOrder {

	public static void main(String[] args) {

		String[] arr = { "java", "jsp", "servlets", "hibernate", "springBoot" };

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);

		}

	}

}
