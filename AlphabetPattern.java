package com.xworkz.aptitudeclass.assignment5;

public class AlphabetPattern {

	public static void main(String[] args) {
		int row = 5;
		int mid = row / 2 + 1;
		
		patternA(row, mid);
		System.out.println();
		patternB(row, mid);
		System.out.println();
		patternC(row);
		System.out.println();
		patternD(row);
		System.out.println();
		patternE(row, mid);
		System.out.println();
		patternF(row, mid);
		System.out.println();
		patternG(row, mid);
		System.out.println();
		patternH(row, mid);
		System.out.println();
		patternI(row, mid);
		System.out.println();
		patternJ(row, mid);
		System.out.println();
		patternK(row, mid);
		System.out.println();
		patternL(row);
		System.out.println();
		patternM(row, mid);
		System.out.println();
		patternN(row);
		System.out.println();
		patternO(row);
		System.out.println();
		patternP(row, mid);
		System.out.println();
		patternQ(row, mid);
		System.out.println();
		patternR(row, mid);
		System.out.println();
		patternS(row, mid);
		System.out.println();
		patternT(row, mid);
		System.out.println();
		patternU(row);
		System.out.println();
		patternV(row, mid);
		System.out.println();
		patternW(row, mid);
		System.out.println();
		patternX(row);
		System.out.println();
		patternY(row, mid);
		System.out.println();
		patternZ(row);
	}

	public static void patternA(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == mid)
					System.out.print("* ");
				else if (r > mid && (c == 1 || c == row))
					System.out.print("* ");
				else if (c - r == row / 2)
					System.out.print("* ");
				else if ((r + c) - (row / 2) == 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternB(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || ((r == row || r == 1) && c < row - 1))
					System.out.print("* ");
				else if (c <= mid && r == mid)
					System.out.print("* ");
				else if (r + c == row + 1 && r < mid && r > 1)
					System.out.print("* ");
				else if (r == c && r > mid && r < row)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternC(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 && r > 1 && r < row)
					System.out.print("* ");
				else if (c > 1 && (r == 1 || r == row))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternD(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || ((r == 1 || r == row) && c < row))
					System.out.print("* ");
				else if (r > 1 && r < row && c == row)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternE(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || r == 1 || r == row || r == mid)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void patternF(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || r == 1 || r == mid)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void patternG(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 && r > 1 && r < row)
					System.out.print("* ");
				else if (c > 1 && (r == 1 || r == row))
					System.out.print("* ");
				else if (r >= mid && c == row)
					System.out.print("* ");
				else if (r == mid && c >= mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternH(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == mid || (c == 1 || c == row))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternI(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == mid || r == row || r == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternJ(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == 1 || (r == row && c > 1 && c < row))
					System.out.print("* ");
				else if (c == row && r < row)
					System.out.print("* ");
				else if (c == 1 && r < row && r > mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternK(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || c <= mid && r == mid)
					System.out.print("* ");
				else if (r + c == row + 1 && r <= mid)
					System.out.print("* ");
				else if (r == c && r >= mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternL(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == row || c == 1)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void patternM(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || c == row)
					System.out.print("* ");
				else if ((r == c || r + c == row + 1) && r <= mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternN(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || c == row || r == c)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternO(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if ((c == 1 || c == row) && r > 1 && r < row)
					System.out.print("* ");
				else if ((r == 1 || r == row) && c > 1 && c < row)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternP(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || (r == 1 && c < row - 1))
					System.out.print("* ");
				else if (c <= mid && r == mid)
					System.out.print("* ");
				else if (r + c == row + 1 && r < mid && r > 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternQ(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if ((c == 1 || c == row) && r > 1 && r < row - 1)
					System.out.print("* ");
				else if (r == 1 && c > 1 && c < row)
					System.out.print("* ");
				else if (r == row - 1 && c > 1 && c < row - 1)
					System.out.print("* ");
				else if (r == c && r >= mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternR(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || (r == 1 && c < row - 1))
					System.out.print("* ");
				else if (c <= mid && r == mid)
					System.out.print("* ");
				else if (r + c == row + 1 && r < mid && r > 1)
					System.out.print("* ");
				else if (r == c && r > mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternS(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 && r > 1 && r < mid)
					System.out.print("* ");
				else if (r == mid && c > 1 && c < row)
					System.out.print("* ");
				else if (c == row && r < row && r > mid)
					System.out.print("* ");
				else if ((c > 1 && r == 1) || (c < row && r == row))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternT(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == 1 || c == mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternU(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == row && c > 1 && c < row)
					System.out.print("* ");
				else if (r < row && (c == 1 || c == row))
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
					System.out.print("* ");
				else if (r <= mid && (c == 1 || c == row))
					System.out.print("* ");
				else if (c + r == row + mid)
					System.out.print("* ");
				else if (r - c == row / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternW(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || c == row)
					System.out.print("* ");
				else if ((r == c || r + c == row + 1) && r >= mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternX(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r + c == row + 1 || r == c)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternY(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r + c == row + 1 || (r == c && r <= mid))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternZ(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == 1 || r == row || r + c == row + 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}