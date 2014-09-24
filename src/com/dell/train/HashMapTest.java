package com.dell.train;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		// HashMap is not sorted
		Map<Integer, String> map = new HashMap<Integer, String>();
		//LinkedHashMap maintains the order of insertion
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		//TreeMap does natural ordering
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		map.put(2, "Two");
		map.put(8, "Eight");
		map.put(10, "Ten");
		map.put(4, "Four");
		map.put(3, "Three");
		map.put(9, "Nine");
		map.put(4, "Hello");

		System.out.println(map.get(10));
		// TODO
		// Put the Map Iteration here
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}
