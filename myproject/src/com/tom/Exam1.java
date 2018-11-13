package com.tom;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		System.out.print("Pleace enter number of ticket: ");
		Scanner scanner = new Scanner(System.in);
		int oneTrip = scanner.nextInt();
		System.out.print("How many round-trip ticket: ");
		int roundTrip = scanner.nextInt();
		System.out.println("Total tickets : " + (oneTrip + roundTrip) + "\n" + "round-trip tickets : " + roundTrip
				+ "\n" + "Total price: " + (1000 * oneTrip + 1800 * roundTrip));

	}

}
