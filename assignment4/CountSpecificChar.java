package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class CountSpecificChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine(); // harsha
		System.out.println("Enter a character :");
		char c = sc.next().charAt(0); // a
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) { // h != a // a == a // r != a // s != a // h != a // a == a
				count++; // 1+1
			}
		}
		System.out.println("Count of character'" + c + "' in given String\n"+count);
	}
}
