package com.dell.train;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionListDemo {

	public static void main(String[] args) {
		// LinkedList if faster when you want to add items towards the beginning
		// or middle of List
		// ArrayList is BIG PAIN at the beginning
		List<Integer> newArrayList = new ArrayList<Integer>();
		List<Integer> newLinkedList = new LinkedList<Integer>();
		newArrayList.add(9);
		for (int i = 0; i < 10; i++) {
			newArrayList.add(i);
			newLinkedList.add(i);
		}
		
//		System.out.println("Using in-built method to print: "
//				+ newArrayList.get(0)
//				+ newLinkedList.get(newLinkedList.size() - 1));
		System.out.println("Using for each loop to print");
		for (Integer value : newArrayList) {
			System.out.println(value);
		}

		System.out.println("Removing items");
		newLinkedList.remove(newLinkedList.size() - 1);
		for (Integer value : newLinkedList) {
			System.out.println(value);
		}
	}

}
