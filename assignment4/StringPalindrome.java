package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.nextLine();
		String revStr = "";
		for (int j = str.length() - 1; j >= 0; j--) {
			revStr += str.charAt(j);
		}
		if (str.equals(revStr))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}
}