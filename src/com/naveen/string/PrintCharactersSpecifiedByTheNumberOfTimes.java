package com.naveen.string;

public class PrintCharactersSpecifiedByTheNumberOfTimes {

	public static void main(String[] args) {
		
		String s = "abc3e2f4";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			
			char ch1 = s.charAt(i+1);
			
			if(ch1>='0'&& ch1<='9') {
				
				for(int j=1;j<=(ch1-48);j++) {
					System.out.print(ch);
				}
				i++;// Skip the next digit character
			}else {
				System.out.print(ch);
			}
			
			
		}
		System.out.println();
		
		
	 
	}
}
