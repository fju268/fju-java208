package com.tom;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = new Person(68.5f, 1.7f);
//		   p.weight=68.5f;
//		   p.height=1.7f;
//		String name = "ham";
//		int english = 70;
//		int math = 90;
//		System.out.println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2);
        Student stu = new Student();
        stu.name="Ham";
        stu.english = 70;
        stu.math = 90;
        stu.print();
	}

}
