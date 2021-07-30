package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word :");
		String str = sc.nextLine();
		char[] charArr = str.toCharArray();
		String revWord = "";
		
		for (int i = 0; i < 1; i++) {
			for (int j = charArr.length - 1; j >= 0; j--) {
				revWord += str.charAt(j);
            }
		}
		if(str.equals(revWord))
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not a palindrome");
    }
}