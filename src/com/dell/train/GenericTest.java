package com.dell.train;

public class GenericTest {

	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, 2, 3 };
		Double[] doubelArray = { 1.1, 2.2, 3.3 };
		Character[] charArray = { 'a', 'b', 'c' };

		printArray(intArray);
		printArray(doubelArray);
		printArray(charArray);
	}

}
