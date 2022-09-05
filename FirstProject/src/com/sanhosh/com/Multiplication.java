package com.sanhosh.com;

public class Multiplication {

	private int k;
	private int l;
	private int x;
	private int y;

	Multiplication() {
		this(5, 6, 1, 10);
	}

	Multiplication(int k, int l, int x, int y) {
		if (k > 0) {
			this.k = k;
		}
		if (l > 0) {

			this.l = l;
		}
		if (x > 0) {
			this.x = x;
		}
		if (y > 0) {
			this.y = y;
		}
	}

	void calculate() {

		for (int j = k; j <= l; j++) {
			System.out.println("\n\tend of table");
			for (int i = x; i <= y; i++) {

				System.out.printf("%d x %d =%d", j, i, j * i).println();
			}
		}
	}

	public void estimate() {
		// TODO Auto-generated method stub
		System.out.println("trail");
	}
}
