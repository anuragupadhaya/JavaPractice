package com.dell.train;

public class InstanceOf {
	static {
		System.out.println("Static code block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "007";
		boolean result = name instanceof String;
		System.out.println(result);
		InstanceOf i = new InstanceOf();
		result = i instanceof InstanceOf;
		System.out.println(result);
	}

}
