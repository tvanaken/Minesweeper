package edu.unca.csci202;

public class Minesweeper {

	public static void main(String[] args) throws InvalidInputException{

		Gameboard game = new Gameboard();
		
		game.intro();
		
		game.run();
	}

}
