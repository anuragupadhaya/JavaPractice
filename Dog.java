package com.dell.train;

public class Dog {

	String breed;
	int age;
	String color;

	Dog() {
		breed = "Indian";
		age = 2;
		color = "White";
	}

	Dog(String b, int a, String c) {
		this.breed = b;
		this.age = a;
		this.color = c;
	}

	void barking() {

	}

	void sleeping() {

	}

	void hungry() {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
