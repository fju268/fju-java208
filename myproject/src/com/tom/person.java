package com.tom;

public class person {
	float weight;
	float height;

	public void Person(float weight, float height) {
		this.weight = weight;
		this.height = height; 
    }

	public void hello(){
		System.out.println("Hello");
		
		
	}
	public float bmi (){
		float bmi = weight/(height*height);
		return bmi;
	}
}
