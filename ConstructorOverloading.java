package com.dell.train;

public class ConstructorOverloading {

	private int rollNumber;

	ConstructorOverloading() {
		rollNumber = 100;
	}

	ConstructorOverloading(int rnum) {
		this();
		rollNumber = rollNumber + rnum;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ConstructorOverloading obj = new ConstructorOverloading(3);

		System.out.println(new ConstructorOverloading(3).getRollNumber());
	}

}
