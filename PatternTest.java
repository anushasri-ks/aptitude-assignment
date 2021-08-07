package com.xworkz.aptitudeclass.test;

public class PatternTest {

	public static void main(String[] args) {

		int row = 7;
		int mid = row / 2 + 1;
		PatternK(row, mid);
		System.out.println();
		patternNum(row);
		System.out.println();
		oddEvenPosition(row);
		System.out.println();
		patternV(row, mid);
		System.out.println();
		patternSpaced(row);
		System.out.println();
		patternDiamond(row, mid);
		System.out.println();
	}

	public static void patternDiamond(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r <= mid && r + c >= mid + 1 && c - r < mid)
					System.out.print("* ");
				else if (r > mid && r - c < mid && r + c <= row + mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternSpaced(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r % 2 == 0 && c % 2 == 0)
					System.out.print("* ");
				else if (r % 2 != 0 && c % 2 != 0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternV(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == row && c == mid)
					System.out.print("**");
				else if (r <= mid && (c == 1 || c == row))
					System.out.print("**");
				else if (c + r == row + mid)
					System.out.print("**");
				else if (r - c == row / 2)
					System.out.print("**");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void oddEvenPosition(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r % 2 == 0 && c % 2 != 0)
					System.out.print(r + "" + c);
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternNum(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1)
					System.out.print(r + " ");
				else if (r >= c)
					System.out.print(c + r - 1 + " ");
			}
			System.out.println();
		}
	}

	public static void PatternK(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1)
					System.out.print("**");
				else if (r + c == row + 1 && r <= mid)
					System.out.print("**");
				else if (r == c && r > mid)
					System.out.print("**");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}