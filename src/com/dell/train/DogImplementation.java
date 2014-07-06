package com.dell.train;

public class DogImplementation {

	public static void main(String args[]) {
		Dog d1 = new Dog();
		System.out.println(d1.breed + d1.age + d1.color);
		Dog d2 = new Dog("new breed", 4, "black");
		System.out.println(d2.breed);
		d2.setAge(6);
		System.out.println(d2.getAge());

	}
}
