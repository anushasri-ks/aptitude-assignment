package com.xworkz.aptitudeclass.assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = findFactorial(num, 1);
		System.out.println("Factorial of "+num +" = "+temp);
	}
	public static int findFactorial(int num, int temp) {
		if (num == 0)
			return temp;
		temp *= num;
		num--;
		return findFactorial(num, temp);
	}
}