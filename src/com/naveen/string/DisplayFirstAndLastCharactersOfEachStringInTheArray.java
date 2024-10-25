package com.naveen.string;

public class DisplayFirstAndLastCharactersOfEachStringInTheArray {

	public static void main(String[] args) {
		 
		String[] arr = { "java", "jsp", "servlets", "hibernate", "springBoot" };
		
		for (int i = 0; i < arr.length; i++) {
			
			String s=arr[i];
			
			System.out.println(s.charAt(0)+" "+s.charAt(s.length()-1));
			
		}


	}

}
