package com.tom;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		int i;
		for(i=5;i<=100;i+=5){
			System.out.println(i);
		}
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
//		Person p = new Person(68.5f, 1.7f);
//		   p.weight=68.5f;
//		   p.height=1.7f;
//		String name = "ham";
//		int english = 70;
//		int math = 90;
//		System.out.println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2);
        
	}

}
