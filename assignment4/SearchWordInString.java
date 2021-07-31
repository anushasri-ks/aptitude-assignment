package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class SearchWordInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		System.out.println("Enter a word to search :");
		String oldStr = sc.nextLine();
		System.out.println("Word '" + oldStr + "' in given string? " + str.contains(oldStr));
	}

}
