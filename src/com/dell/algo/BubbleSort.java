package com.dell.algo;

public class BubbleSort {
	private boolean swapped = true;
	private int temp = 0;
	private int k = 0;

	private int[] bubbleSort(int[] array) {
		while (swapped) {
			swapped = false;
			k++;
			for (int l = 0; l < array.length - k; l++) {
				if (array[l] > array[l + 1]) {
					temp = array[l];
					array[l] = array[l + 1];
					array[l + 1] = temp;
					swapped = true;
				}
			}
		}
		return array;
	}

	private void printArray(int[] array) {
		for (int k : array) {
			System.out.println(k);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray = new int[1000];
		for (int j = unsortedArray.length - 1, i = 0; j >= 0; j--, i++) {
			unsortedArray[i] = j;
		}
		BubbleSort bs = new BubbleSort();
		// bs.printArray(unsortedArray);
		bs.bubbleSort(unsortedArray);
		bs.printArray(unsortedArray);
	}

}
