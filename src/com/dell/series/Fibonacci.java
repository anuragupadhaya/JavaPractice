package com.dell.series;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FIBONACCI_LIMIT = 15;
		int[] fibonacci_numbers = new int[FIBONACCI_LIMIT];
		fibonacci_numbers[0] = 0;
		fibonacci_numbers[1] = 1;
		for (int i = 2; i < FIBONACCI_LIMIT; i++) {
			fibonacci_numbers[i] = fibonacci_numbers[i - 1]
					+ fibonacci_numbers[i - 2];
		}

		for (int fib : fibonacci_numbers) {
			System.out.println(fib);
		}
	}
}
