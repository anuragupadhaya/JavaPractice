package com.dell.train;

class Number {
	int x;

	Number() {
		x = 3;
	}
}

public class CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number a = new Number();
		System.out.println("Value of x before calling increment -" + a.x);
		increment(a);
		System.out.println("Value of x after calling increment -" + a.x);
	}

	public static void increment(Number n) {
		System.out.println("Value of n before incrementing -" + n.x);
		n.x = n.x + 3;
		System.out.println("Value of n after incrementing -" + n.x);
	}
}
