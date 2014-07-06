package com.dell.train;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] a = new int[5];
		int[] a = { 10, 30, 20, 65, 51 };
		// for (int i = 0; i < a.length; i++) {
		// System.out.println(a[i]);
		// }
		ArrayUtil.printArray(a);
		System.out.println(a.length);

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("the largest in array is: " + max);

		// for (int i: a)
		// {
		// System.out.println(i);
		// }
		int[] sortedArray = new int[a.length];
		for (int i : a) {

		}
	}

}
