package com.naveen.string;

public class DisplayOnlyDigitsInCharacterArray {

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', '@', '1', '2', '3' };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9')
				System.out.println(arr[i]);
		}

	}

}
