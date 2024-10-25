package com.naveen.string;

public class DisplayHighestDigitiInthegivenString {

	public static void main(String[] args) {
		 
		String s = "coding@365";
		
		int highdigit=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			 if(ch>='0' && ch<= '9') {
				  int x= (int)(ch-48);
				 
				 if(x>highdigit) {
					 highdigit=x;
				 }
			 }
			
		}
		System.out.println(highdigit);

	}

}
