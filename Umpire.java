package com.accenture;

public class Umpire {
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;

	public void collectNumberFromGuesser() {
		Guesser g = new Guesser();
		numberFromGuesser = g.guessNum();
		
	}
	
public void collectNumberFromPlayers() {
 	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	
	numberFromPlayer1 = p1.guessNum();
	numberFromPlayer2 = p2.guessNum();
	numberFromPlayer3 = p3.guessNum();

	
		
	}

public void compare() {
	System.out.println("Number guesser by the guesser: " + numberFromGuesser);


 if (numberFromGuesser==numberFromPlayer1 && numberFromGuesser==numberFromPlayer2 && numberFromGuesser==numberFromPlayer3) {
		System.out.println("Both player 1, 2 and 3 have won the game");
		
		
		//my code
		
		//You can use the array to do an if/else statement
		
 }else if (numberFromGuesser==numberFromPlayer1) {
		System.out.println("Player 1 won the game");
		
 }else if (numberFromGuesser==numberFromPlayer2) {
		System.out.println("Player 2 won the game");
		
 }else if (numberFromGuesser==numberFromPlayer3) {
		System.out.println("Player 3 won the game");
		
	}else if (numberFromGuesser==numberFromPlayer2 && numberFromGuesser==numberFromPlayer3) {
		System.out.println("Both player 2 and 3 have won the game");
		
	}else if (numberFromGuesser==numberFromPlayer1 && numberFromGuesser==numberFromPlayer3) {
		System.out.println("Both player 1 and 3 have won the game");
		
	}else if (numberFromGuesser==numberFromPlayer1 && numberFromGuesser==numberFromPlayer2 && numberFromGuesser==numberFromPlayer3) {
		System.out.println("All players have won the game");
		
	}else {
		System.out.println("Game lost. Try again");

	}
	
}


}
