package com.dell.algo;

public class LinerSearch {
	public static boolean sequentialSearch(int[] array, int a) {
		for (int i : array) {
			if (i == a)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		for (int i : array) {
			System.out.println(i);
		}
		boolean result = LinerSearch.sequentialSearch(array, 100);
		System.out.println(result);
	}

}
