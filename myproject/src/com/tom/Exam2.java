package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Random random = new Random();
		int secret = random.nextInt(10) + 1;
		System.out.print(secret);
		Scanner scanner = new Scanner(System.in);
		int k = -1;
		int count = 0;
		while (k != 0) {
			int num = scanner.nextInt();
			if (secret > num && count <= 4) {
				System.out.println("your guess: " + num + "\t" + "Higher");
			} else if (secret < num && count <= 4) {
				System.out.println("your guess: " + num + "\t" + "Lower");
			} else if (secret == num && count <= 4) {
				System.out.println("Great the secret number is : " + num);

			}
			if(count<=2){
				System.out.println("Excellent ! The secret number is : " + num);
			}
		}

	}
}