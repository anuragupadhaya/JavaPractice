package com.dell.train;

public class InterfaceImplmentation implements InterfaceDemo {

	public void printNumber() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		InterfaceImplmentation im = new InterfaceImplmentation();
		im.printNumber();
	}

}