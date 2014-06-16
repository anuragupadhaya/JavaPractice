package com.dell.train;

public class BinarySearch {
	public static boolean binarySearch(int[] array, int v) {
		int low = 0;
		int high = array.length-1;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (v == array[middle])
				return true;
			if (v < array[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		boolean result = BinarySearch.binarySearch(array, 40);
		System.out.println(result);
	}

}