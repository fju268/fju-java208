package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18 ? (N/Y)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean adult = line.equalsIgnoreCase("y");
		if(adult){
			System.out.println("Your age?");
			int age = scanner.nextInt();
			System.out.println("Your name?");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("your nickName?");
			String nickName = scanner.nextLine();
			System.out.println(age + "\t" + name + "\t" + nickName);
			
			
			
		}else{
			System.out.println("Go TO Hell!");
			
		}

	}

}
