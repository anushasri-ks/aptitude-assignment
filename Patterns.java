package com.xworkz.aptitudeclass.assignment3;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter square matrix limit: ");
		byte rc = sc.nextByte();
		int mid = (rc / 2) + 1;
		int i = 0;

		System.out.println("-----------");
		pattern1(rc, mid);
		System.out.println("----------------");
		Pattern2(rc, mid);
		System.out.println("----------------");
		pattern3(rc);
		System.out.println("----------------");
		pattern4(rc);
		System.out.println("----------------");
		pattern5(rc, i);
		System.out.println("----------------");
		pattern6(rc, mid);
		System.out.println("----------------");
		pattern7(rc, mid);
		System.out.println("----------------");
		pattern8(rc);
		System.out.println("----------------");
		pattern9(rc);
		System.out.println("----------------");
		pattern10(rc, i);
	}

	public static void pattern1(byte rc, int mid) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (c <= mid && c <= r && r + c <= rc + 1)
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Pattern2(byte rc, int mid) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r <= mid && (r <= c) && (r + c <= rc + 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern3(byte rc) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r >= c || r + c >= rc + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern4(byte rc) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r >= c || r + c <= rc + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern5(byte rc, int i) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r >= c || r + c >= rc + 1) {
					i += 1;
					if (i < 10)
						System.out.print(" " + i + " ");
					else
						System.out.print(i + " ");
				} else
					System.out.print("   ");
			}
			i += i;
			System.out.println();
		}
	}

	public static void pattern6(byte rc, int mid) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (c >= mid && c >= r && r + c >= rc + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern7(byte rc, int mid) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r >= mid && c <= r && r + c >= rc + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern8(byte rc) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r <= c || r + c <= rc + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern9(byte rc) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r <= c || r + c >= rc + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern10(byte rc, int i) {
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r >= c || r + c <= rc + 1) {
					i += 1;
					if (i < 10)
						System.out.print(" " + i + " ");
					else
						System.out.print(i + " ");
				} else
					i += 1;
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
