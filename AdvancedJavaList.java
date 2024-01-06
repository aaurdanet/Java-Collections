package Cop2085;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class AdvancedJavaList {
	public static void main(String[] args) {

		List<Double> numbers = new ArrayList<>();
		numbers.add(1.5);
		numbers.add(2.35);
		numbers.add(-4.7);
		numbers.add(0.01);

		PrintList(numbers);
		SortList(numbers);
		FindInList(numbers);
		FillZero(numbers);

	}

	public static void FillZero(List<Double> numbers) {
		Collections.fill(numbers, 0.00);
		System.out.println("\nList elements after fill:\n" + numbers);

	}

	public static void FindInList(List<Double> numbers) {
		int index = Collections.binarySearch(numbers, 1.5);
		System.out.println("\n1.5 found at index:\t\n" + index);

	}

	
	public static void SortList(List<Double> numbers) {
		Collections.sort(numbers);
		System.out.println("\nList after the use of" + " Collection.sort():\n" + numbers);
	}

	public static void PrintList(List<Double> numbers) {
		System.out.println("Unsorted list:");
		Iterator iterator = numbers.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}

		// System.out.println("Unsorted list:");
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
	}
}