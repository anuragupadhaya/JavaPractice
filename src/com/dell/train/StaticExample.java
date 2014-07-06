package com.dell.train;

public class StaticExample {
	private static int i = 0;
	int j = 0;
	
	public static int addition (int x, int y)
	{
		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample s = new StaticExample();
		StaticExample s1 = new StaticExample();
		i = 10;
		s.j = 10;
		System.out.println(i);
		System.out.println(s.j);
		System.out.println(StaticExample.i);
		System.out.println(s1.j);
		System.out.println(addition(1,2));

	}

}