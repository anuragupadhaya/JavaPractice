package com.dell.train;

import java.util.Date;

public class TestingEquality {

	private int empID;
	private String empName;

	private TestingEquality() {
		empID = 0;
		empName = "Stickman";
	}

	private TestingEquality(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}

	public boolean equals(TestingEquality ob) {
		if (ob instanceof TestingEquality) {
			if ((((TestingEquality) ob).empID == this.empID)
					&& (((TestingEquality) ob).empName == this.empName)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingEquality ts1 = new TestingEquality();
		TestingEquality ts2 = new TestingEquality();
		TestingEquality ts3 = ts1;
		TestingEquality ts4 = new TestingEquality(100, "anurag");
		int integer1 = 10;
		int integer2 = 10;
		int integer3 = integer1;
		Date date = new Date();

		// comparing equality of Objects using .equals but no overloading
		boolean resultOfTestingObjects = ts1.equals(ts2);
		System.out.println(resultOfTestingObjects);
		resultOfTestingObjects = ts1.equals(ts3);
		System.out.println(resultOfTestingObjects);

		// comparing equality of Objects using overloaded .equals, yeah baby !
		// before running this, you might want to comment the above code block
		resultOfTestingObjects = ts1.equals(ts2);
		System.out
				.println("result after overloading:" + resultOfTestingObjects);
		resultOfTestingObjects = ts1.equals(ts4);
		System.out.println(resultOfTestingObjects);
		// just try to find out which implementation of .equals is called here.
		// Pretty simple
		resultOfTestingObjects = ts1.equals(date);
		System.out
				.println("testing with date object:" + resultOfTestingObjects);

		// comparing equality of Objects using "==" operator
		resultOfTestingObjects = (ts1 == ts2);
		System.out.println(resultOfTestingObjects);
		resultOfTestingObjects = (ts1 == ts3);
		System.out.println(resultOfTestingObjects);

		// comparing equality of Primitive Data types using "==" operator
		boolean resultOfTestingPrimitives = (integer1 == integer2);
		System.out.println(resultOfTestingPrimitives);
		resultOfTestingPrimitives = (integer1 == integer3);
		System.out.println(resultOfTestingPrimitives);

		// comparing equality of Primitive Data types using .equals operator
		// resultOfTestingPrimitives = integer1.equals(integer2);
		// nope. Not gonna work
	}
}
