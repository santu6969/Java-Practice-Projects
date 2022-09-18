package com.santhosh.OOPSInterfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move Piece Up");
	}

	@Override
	public void down() {
		System.out.println("Move Piece Down");
	}

	@Override
	public void left() {
		System.out.println("Move Piece Left");
	}

	@Override
	public void right() {
		System.out.println("Move Piece Right");
	}

}
