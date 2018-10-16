package com.tom;

public class Student {
	String name = "Ham";
	int english;
	int math;

	public void print() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + (math + english) / 2);
	}

}
