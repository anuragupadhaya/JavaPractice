package com.dell.train;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateInArray {

	public <E> Set<E> removeDuplicates(E[] array) {
		Set<E> uniqueSet = new LinkedHashSet<E>();
		for (E a : array) {
			if (!uniqueSet.add(a))
				System.out.println("Duplicate item: " + a);
		}
		return uniqueSet;

	}

	public <K, E> Map<K, Integer> countDuplicates(E[] array) {
		Map<K, Integer> uniqueMap = new LinkedHashMap<K, Integer>();

		for (Integer i = 0; i < array.length; i++) {

			if (uniqueMap.containsKey(array[i])) {
				uniqueMap.put((K) array[i], uniqueMap.get(array[i]) + 1);
			} else
				uniqueMap.put((K) array[i], 1);
		}

		return uniqueMap;

	}

	public <E> void print(Set<E> uniqueSet) {
		for (E a : uniqueSet)
			System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArrayWithDuplicates = { 20, 30, 20, 10, 40, 10 };
		String[] stringArrayWithDuplicates = { "abc", "cde", "abc", "def",
				"cde" };
		DuplicateInArray d = new DuplicateInArray();
		// System.out.println("Enter items for Integer array");
		// Scanner in = new Scanner(System.in);
		// !"".equals(in.nextLine()) this would also work
		// as well as !in.nextLine().isEmpty()
		// while (!"".equals(in.nextLine())) {
		// for (int i = 0; i > 0; i++)
		// intArrayWithDuplicates[i] = in.nextInt();
		// }

		Set<Integer> uniqueSetInt = d.removeDuplicates(intArrayWithDuplicates);
		d.print(uniqueSetInt);

		System.out.println("Count of Key and Duplicate Values");
		Map<Integer, Integer> uniqueMap = d
				.countDuplicates(intArrayWithDuplicates);
		for (Integer key : uniqueMap.keySet()) {
			Integer value = uniqueMap.get(key);
			System.out.println(key + ": " + value);
		}
		// System.out.println("Enter items for String array");
		// while (!in.nextLine().isEmpty()) {
		// for (int i = 0; i > 0; i++)
		// stringArrayWithDuplicates[i] = in.next();
		// }
		// in.close();
		Set<String> uniqueSetString = d
				.removeDuplicates(stringArrayWithDuplicates);
		d.print(uniqueSetString);
		System.out.println("Count of Key and Duplicate Values");
		Map<String, Integer> uniqueMapString = d
				.countDuplicates(stringArrayWithDuplicates);
		for (String key : uniqueMapString.keySet()) {
			Integer value = uniqueMapString.get(key);
			System.out.println(key + ": " + value);
		}

	}
}
