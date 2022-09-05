package com.santhosh.loops;

public class WhileNumberPlayer {
	int i;

	public WhileNumberPlayer(int i) {
		this.i = i;
	}

	public void printSquaresUptoLimit() {
		int j = 1;
		while (j * j < i) {
			System.out.print(j * j + " ");
			j++;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		int j = 1;
		while (j * j * j < i) {
			System.out.print(j * j * j + " ");
			j++;
		}
	}

}
