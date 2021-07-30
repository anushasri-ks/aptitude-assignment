package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class RemovesDuplicateCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		char[] charArr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					charArr[i] = '0';
				} else
					System.out.print("");
			}
			if (charArr[i] != '0')
				System.out.print(charArr[i]);
		}
	}
}