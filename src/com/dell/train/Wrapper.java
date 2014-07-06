package com.dell.train;

public class Wrapper {
	Integer x = 10;
	String y = "10";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wrapper w = new Wrapper();
		String s = Integer.toString(w.x);
		System.out.println(s);
		int converted = Integer.valueOf(w.y).intValue();
		converted+=1;
		System.out.println(converted);
		Character ch = new Character('a');
		System.out.println(Character.toUpperCase(ch));
	}

}
