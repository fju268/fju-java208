package com.tom;

import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		double random = Math.random();
		random*=1000;
		int num = (int)random;
		Scanner scanner = new Scanner(System.in);
		while(true){
			int guess = scanner.nextInt();
		}
	}

}
