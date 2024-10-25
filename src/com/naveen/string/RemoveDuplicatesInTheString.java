package com.naveen.string;

public class RemoveDuplicatesInTheString {

	public static void main(String[] args) {
		 
		String str = "aaabbababaacccbabdcccbdddbac";
		 String res = "";

	        // Iterate through each character in the string
	        for (int i = 0; i < str.length() - 1; i++) {
	            int j = 0;
	            // Check if the character has appeared before
	            for (j = 0; j < i; j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    break; // If character is found, break the inner loop
	                }
	            }
	            // If character was not found in previous positions, add it to result
	            if (j == i) {
	                res = res + str.charAt(i);
	            }
	        }

 	        System.out.println("Given String : " + str);
	        System.out.println("Resultant string : " + res);
	    }
	}


