package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		str = str.trim();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') {
				count++;
			}
		}
		System.out.println("Count of words in String = "+(count + 1));
	}
}
