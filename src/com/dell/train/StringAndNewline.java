package com.dell.train;

public class StringAndNewline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello\nWorld");
		System.out.println("\"this is example of quotes\"");
		System.out.println("Anurag\tU");

		String String1 = "Anurag";
		String String2 = "anurag";
		
		boolean result = String1.equalsIgnoreCase(String2)? true:false;
		System.out.println(result);
		
		System.out.println(result = "anurag".equals(String1));
		System.out.println(result = String1.isEmpty());

	}

}
