package com.tom;

public class hello {

	public static void main(String[] args) {
		Person p = new Person(65.5f, 1.7f); 
//		p.weight = 65.5f;
//		p.height = 1.7f;
		System.out.println(p.bmi());
		p.hello();
	}

}
     