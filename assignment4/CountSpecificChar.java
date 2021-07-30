package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class CountSpecificChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		System.out.println("Enter a character :");
		char c = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("Count of character'" + c + "' in given String = " + count);
	}
}
