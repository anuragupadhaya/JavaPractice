package com.dell.train;

public class LocalVariable {
	int awesome; // this won't require assignment as this is instance variable
	boolean istrue;

	public void pupAge() {
		int age = 0;
		age = age + 7;
		System.out.println("Pups age is:" + age);
		System.out.println(istrue);

	}

	public static void main(String args[]) {
		LocalVariable l = new LocalVariable();
		System.out.println(l);
		l.pupAge();
		for (int i = 0; i <= 10; i++) {
			i++;
			System.out.println(i);
		}
		// System.out.println(i);
		// local variable being used
		if (true != false) {
			int j = 100;
			System.out.println("not a dead code !");
			System.out.println(j);
		}
		// System.out.println(j);
		// local variable being used
	}
}
