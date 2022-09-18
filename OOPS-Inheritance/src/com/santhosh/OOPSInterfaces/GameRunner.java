package com.santhosh.OOPSInterfaces;

public class GameRunner {

	public static void main(String[] args) {
		// GamingConsole game = new MarioGame();
		GamingConsole[] games = { new ChessGame(), new MarioGame() };
		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
	}

}
