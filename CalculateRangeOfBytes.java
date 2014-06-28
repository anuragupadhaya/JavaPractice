package com.dell.train;

import java.util.Scanner;

//important thing to note here is the range of 1 byte and the total number of values it can store.
//if you run the program, you will come to know that 1 byte can store a maximum of 256 "values"
//i.e range will be -128 to +127 (including 0). Hence understood that datatypes are signed in Java.
public class CalculateRangeOfBytes {

	public static void main(String[] args) {

		int numberOfBytes = 0; // This is number of bytes
		int totalBytes = 0; // One byte has 8 bits e.g : 11111111
		double range = 0; // This is the final calculated range

		Scanner in = new Scanner(System.in); // Scanner class for taking user
												// input
		System.out.println("Enter the number of Bytes");
		numberOfBytes = in.nextInt(); // nextInt is a method of Scanner class
										// for taking Integer inputs
		totalBytes = numberOfBytes * 8; // Calculating number of bytes with user
										// input
		while (totalBytes > 0) {
			totalBytes--; // If the input is 1 byte we start with 7 as the first
							// power since the first bit is reserved for sign
							// (positive/negative)
			double i = Math.pow(2, totalBytes);
			System.out.println(i);
			System.out.println("Power is now - " + totalBytes);
			range = range + i;
		}
		System.out.println((int) range);
		in.close();
	}

}
