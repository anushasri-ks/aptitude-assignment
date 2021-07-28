package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		char[] charArr = str.toCharArray();
		char c = ' ';
		int count = 0;
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == c) {
				count++;
			}
		}
		System.out.println("Count of words in String");
		System.out.println(count + 1);
	}
}
