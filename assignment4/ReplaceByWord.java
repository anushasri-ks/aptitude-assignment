package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class ReplaceByWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		System.out.println("Enter a word you want to replace :");
		String oldStr = sc.nextLine();
		System.out.println("Enter a word you want to replace with: ");
		String newStr = sc.nextLine();
		if (str.contains(oldStr))
			str = str.replace(oldStr, newStr);
		System.out.println(str);
	}
}