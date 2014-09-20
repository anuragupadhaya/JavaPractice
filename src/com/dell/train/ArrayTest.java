package com.dell.train;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
//		Arrays.fill(a,100);
		for(int i=0,j=10;i<a.length;i++,j--){
			a[i]=j;
		}
		
		Arrays.sort(a);
		for(int i:a){
			System.out.println(i);
		}
		System.out.println(Arrays.binarySearch(a,6));
	}

}
