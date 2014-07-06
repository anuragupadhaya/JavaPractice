package com.dell.train;

public class ArrayUtil {
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static int[] reverseArray(int[] array) {

		int[] result = new int[array.length];

		for (int i = 0, j = result.length - 1; i < array.length; i++, j--) {
			result[j] = array[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 90, 80, 70, 60, 50 };
		ArrayUtil.printArray(array);
		int[] reversedarray = ArrayUtil.reverseArray(array);
		System.out.println("The reversed array is:");
		// for (int i : reversedarray)
		// System.out.println(i);
		ArrayUtil.printArray(reversedarray);
	}

}