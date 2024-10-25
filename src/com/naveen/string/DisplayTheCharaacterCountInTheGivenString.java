package com.naveen.string;

public class DisplayTheCharaacterCountInTheGivenString {

	public static void main(String[] args) {
		String s = "aaabbbaccccddacdd";
		
		int[] arr = new int[256]; //there are 256 possible ASCII characters (from 0 to 255).
		
		 char[] charArray = s.toCharArray();
		 
	        for (int i = 0; i < charArray.length; i++) {
	            arr[charArray[i]]++;  // Increment count for each character ASCII value
	        }

	        // Print the non-zero frequencies
	        for (int i = 0; i < 256; i++) {
	            if (arr[i] != 0) {
	                System.out.println((char) i + " : " + arr[i]);
	            }
	        }
	}

}
