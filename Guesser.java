package com.accenture;

import java.util.Random;

public class Guesser {
	int gnum;
	
	public int guessNum() {
//		System.out.println("Guesser, kindly guess a number");
//		Scanner scan = new Scanner(System.in);
//		gnum = scan.nextInt();
		//int gnum = (int) (5 * Math.random());
		Random rand = new Random();
		gnum = rand.nextInt(1, 10);
		return gnum;
	}
}
