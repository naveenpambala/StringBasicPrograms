package com.naveen.string;

public class DisplayLongestWordInTheGivenString {

	public static void main(String[] args) {

		String s = "This is the Longes  Sentense in Java";
		
		StringBuilder sb = new StringBuilder();
		
		String longestword = " ";
		
		for(int i =0; i< s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch == ' ') {
				if(sb.length() > 0) {
					if(sb.length()> longestword.length()) {
						longestword = sb.toString();
					}
					
					sb = new StringBuilder();
				}
				
			}
			sb.append(ch);
			
		}
		
		if(sb.length()>0  && sb.length() > longestword.length()) {
			longestword = sb.toString();
		}
		
		System.out.println("longestword is  "+longestword);

		 
	}

}
