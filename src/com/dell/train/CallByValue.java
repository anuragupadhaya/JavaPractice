package com.dell.train;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println("Value of x before calling increment -" + x);
		increment(x);
		System.out.println("Value of x after calling increment -" + x);
	}

	public static void increment(int a) {
		System.out.println("Value of a before increment	-" + a);
		a = a + 10;
		System.out.println("Value of a after increment	-" + a);
	}

}
