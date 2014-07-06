package com.dell.train;

public class WrappingUnwrapping {
	public static void main(String args[]) {
		byte b = 2;
		int i = 10;
		float f = 10.6f;
		double d = 50.6;
		String s="10";
		// wrapping
		Byte b1 = new Byte(b);
		Integer i1 = new Integer(i);
		Float f1 = new Float(f);
		Double d1 = new Double(d);
		// printing wrapped objects
		System.out.println(b1);
		System.out.println(i1);
		System.out.println(f1);
		System.out.println(d1);
		// unwrapping objects to data types
		byte b2 = b1.byteValue();
		int i2 = i1.intValue();
		float f2 = f1.floatValue();
		double d2 = d1.doubleValue();
		// printing unwrapped data types
		System.out.println(b2);
		System.out.println(i2);
		System.out.println(f2);
		System.out.println(d2);
		
		int stringToInt = Integer.valueOf(s);
		System.out.println(stringToInt+1);
		
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
		
		String s1=Integer.toString(i);
		System.out.println(s1+1);
		
		Integer intObject = new Integer("34");
	}
}
