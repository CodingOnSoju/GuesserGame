package com.accenture;

import java.util.Scanner;

public class Player {
	int pnum;
	
	public int guessNum() {
		System.out.println("Player, kindly guess a number between 1-9");
		Scanner scan = new Scanner(System.in);
		pnum = scan.nextInt();
		return pnum;

	}
}
