package com.dell.train;

public class TestingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			System.out.println("Present value of i=" + i
					+ " Present value of j=" + j);
			array[j] = i;
			System.out.println("Array:" + j + "=" + i);
		}
		for (int k : array) {
			System.out.println(k);
		}
		//
		// for (int i = 0; i < array.length; i++) {
		// System.out.println(array[i]);
		// }
	}

}
