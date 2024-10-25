package com.naveen.string;

public class DisplayTheLengthofEachStringInTheArray {

	public static void main(String[] args) {

		String[] arr = { "java", "jsp", "servlets", "hibernate", "springBoot" };

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i].length());

		}

	}

}
