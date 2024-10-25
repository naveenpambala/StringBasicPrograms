package com.naveen.string;

public class RemoveDuplicatesInTheGivenString {

	public static void main(String[] args) {
		String s1 = "aaaabbaababaaabccccaaab";
		
		String res =" ";
		
		for (int i = 0; i <  s1.length(); i++) {
			
			int j=0; //to check if the character at index i has already appeared before by comparing it with all characters from the start up to i - 1
			for ( j = 0; j < i; j++) {
				
				
				if(s1.charAt(i) == s1.charAt(j)) {
					break;
				}
				
			}
			if(j==i) {
				res =res+s1.charAt(i);
			}
		}
		System.out.println("Given String : " + s1);
		System.out.println("Resultant string : " + res);
	}

}



//
//Example Walkthrough
//Let’s apply this to a small example: str = "abac"
//
//First Iteration (i = 0):
//
//j loop doesn’t run because j < i (i.e., j < 0) is false.
//j == i is true, so res becomes "a".
//Second Iteration (i = 1):
//
//j = 0 (comparing str[1] with str[0]): "b" is not equal to "a".
//Inner loop ends (j reached i), so res becomes "ab".
//Third Iteration (i = 2):
//
//j = 0 (comparing str[2] with str[0]): "a" is equal to "a".
//break is triggered; j doesn’t reach i.
//str[2] is a duplicate, so we skip adding it to res.
//Fourth Iteration (i = 3):
//
//j = 0, "c" is not equal to "a".
//j = 1, "c" is not equal to "b".
//j = 2, "c" is not equal to "a".
//j reaches i, meaning no duplicate was found, so res becomes "abc".
