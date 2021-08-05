package com.xworkz.aptitudeclass.assignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = checkPalindrome(num, 0);

		if (temp == num)
			System.out.println(num + " is a palindrome");
		else
			System.out.println(num + " is not a palindrome");
	}

	public static int checkPalindrome(int num, int temp) { // 545, 0 // 0, 545

		if (num == 0)
			return temp;
		
		int remainder = num % 10; // 5 // 4 // 5
		temp = (temp * 10) + remainder; // 5 // 54 // 545
		num = num / 10; // 54 // 5 // 0

		return checkPalindrome(num, temp);
	}
}