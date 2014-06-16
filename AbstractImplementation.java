package com.dell.train;

public class AbstractImplementation extends AbstractClass {
		
	public void printResult(){
		System.out.println(getName());
		System.out.println(getNumber());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImplementation a = new AbstractImplementation();
		a.setName("Anurag");
		a.setNumber(007);
		a.printResult();
	}

}
