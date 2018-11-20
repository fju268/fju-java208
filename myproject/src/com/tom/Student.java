package com.tom;

public class Student {
	int avarage = getAvarage();
	String name = "Ham";
	int english;
	int math;
	public Student(String name,int english,int math){
		this.name = name;
		this.english=english;
		this.math=math;
	}
	public char level(){
		switch(avarage/10){
		case 10:
		case 9 :	
			return  'A';
		case 8 :
			return 'B';
		case 7 :
			return 'C';
		case 6 :
			return 'D';
		default :
		return 'F';
		
			
		}
		
		
	}
	

	public void print() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + getAvarage()+ "\t" +highest());
		if(getAvarage()< 60){
			System.out.print("FAILED");
		}else{
			System.out.print("PASS");
		}
	}
	public int getAvarage(){
		return(math+english/2);
	}
	public int highest(){
		if(math>english){
			return math;
		}else{
			return english;
		}
	}
	
		
	
}
