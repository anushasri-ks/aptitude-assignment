package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string/word :");
		String str = sc.nextLine();
		String revStr = "";
		for (int j = str.length() - 1; j >= 0; j--) {
			revStr += str.charAt(j);
		}
		System.out.print("Reversed string : " + revStr);
	}
}