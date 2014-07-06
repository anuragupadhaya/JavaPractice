package com.dell.train;

public class ModifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClassForModifierTest s = new SampleClassForModifierTest();
		s.setI(10);
		s.setName("anurag");
		s.setJ(10.141516);
		System.out.println("Value of i-"+s.getI()+",Name-"+s.getName()+",Value of j-"+s.getJ());
		StaticExample s1 = new StaticExample();
//		s1.i=10;
	}
}
