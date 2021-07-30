package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class ReplaceChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		char[] charArr = str.toCharArray();
		System.out.println("Enter a character you want to replace :");
		char oldChar = sc.next().charAt(0);
		System.out.println("Enter a character to be replaced with :");
		char newChar = sc.next().charAt(0);
		String s = "";
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == oldChar) {
				charArr[i] = newChar;
			}
			s += charArr[i];
		}
		System.out.print("Replaced '" + oldChar + "' with '" + newChar + "' : " + s);
	}
}
