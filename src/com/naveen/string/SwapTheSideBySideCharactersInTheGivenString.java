package com.naveen.string;

public class SwapTheSideBySideCharactersInTheGivenString {

	public static void main(String[] args) {
		
		String s1 = "abcde";
		
		 char [] chararry=s1.toCharArray();
		
		for (int i = 0; i < chararry.length-1; i+=2) {
			
			char temp = chararry[i];
			chararry[i] = chararry[i+1];
			chararry[i+1]= temp;
		}
		
		//Convert Charecter Arry To String
		String swappedString = new String(chararry);
		
		System.out.println(s1);
		System.out.println(swappedString);
		
	}
	
//	OR
	
//	String s1 = "abcde";
//	String s2 = "";
//	for (int i=0 ; i<s1.length() ; i+=2){
//	if(i+2 < s1.length())
//	s2 = s2 + s1.charAt(i+1) + s1.charAt(i);
//	else
//	s2 = s2 + s1.charAt(i);
//	}
//	System.out.println("Input String is : " + s1);
//	System.out.println("Output String is : " + s2);
//	}

}
