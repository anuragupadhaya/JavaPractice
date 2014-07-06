package com.dell.train;

import java.util.Scanner;

public class ScannerInputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		byte firstNumber = s.nextByte();
		System.out.println("Enter second number");
		byte secondNumber = s.nextByte();
		byte sum = (byte) (firstNumber + secondNumber);// some brain teaser
														// here. Try to find out
														// why we have to
														// explicitly cast sum
														// of 2 bytes to a byte
														// again?
		System.out.println("Addtion of intergers is:" + sum);
		s.close();
	}

}
