package com.xworkz.aptitudeclass.assignment2;

import java.util.Scanner;

public class XFormNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter square matrix limit: ");
		int rc = sc.nextInt();
		int mid = (rc / 2) + 1;

		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (c >= mid && r + c == rc + 1)
					System.out.print(c);
				else if (c < mid && r + c == rc + 1) {
					System.out.print(r);
				} else if (r == c && c <= mid) {
					System.out.print(c);
				} else if (r == c && c > mid) {
					if (c != 0)
						mid -= 1;
					System.out.print(mid);
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
