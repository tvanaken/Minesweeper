package edu.unca.csci202;

public class Cell {
	
	static char hyphen = '-';
	static char mine = 'M';
	static char digit = '0';
	boolean guess;
	boolean correct;
	char identity;
	
	public Cell(char identity, boolean guess, boolean correct) {
		
		this.identity = identity;
		identity = hyphen;
		this.guess = guess;
		this.correct = correct;
	}
}
