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
		while(k!=0){
		int num = scanner.nextInt();
		
		if(secret > num){
			System.out.println( "your guess: " + num + "\t" + "Higher");
		}else if (secret < num){
			System.out.println("your guess: " + num + "\t" + "Lower");
		}else{
			System.out.println("Great the secret number is : " + num);
		}
		}
	}
}