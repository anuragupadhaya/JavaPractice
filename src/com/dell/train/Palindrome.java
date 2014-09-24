package com.dell.train;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Input the String:");
		original = in.nextLine();
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (reverse.equals(original)) {
			System.out.println("String is Palindrome");
		} else
			System.out.println("String is not Palindrome");
		in.close();
	}

}
