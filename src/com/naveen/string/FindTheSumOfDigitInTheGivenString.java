package com.naveen.string;

public class FindTheSumOfDigitInTheGivenString {

	public static void main(String[] args) {
	 
		String s = "Coding@78";
		int sum=0;
		
		for (int i = 0; i < s.length(); i++) {
			 
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') {
				// Here convert digit to number By using ch-48['0'=48; so 48-48=0,49-48=1,]
				sum +=(int)(ch-48);		
				
			}
			
		}
		System.out.println("Sum "+ sum);

	}

}
