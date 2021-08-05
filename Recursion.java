package com.xworkz.aptitudeclass.assignment;

public class Recursion {

	public static void main(String[] args) {

		int n = 1;
		printNum(n);
		oddOrEven(n);
	}

	static void printNum(int num) {
		if (num <= 10) {
			System.out.print(num);
			num++;
			printNum(num);
		}
	}

	static void oddOrEven(int num) {
		if (num <= 10) {
			if (num % 2 == 0)
				System.out.println(num + " is even");
			else
				System.out.println(num + " is odd");
			num++;
			oddOrEven(num);
		}
	}
}
