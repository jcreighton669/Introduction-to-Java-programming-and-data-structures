/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class ExecutionTime {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int[] numbers = new int[10000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = getRandomInt();
		}
		int key = getRandomInt();

		int searchResult;
		long startTime = System.currentTimeMillis();
		searchResult = linearSearch(numbers, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the linearSearch in milliseconds: " + executionTime);

		selectionSort(numbers);

		startTime = System.currentTimeMillis();
		searchResult = binarySearch(numbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the binarySearch in milliseconds: " + executionTime + " ");
	}

	public static int getRandomInt() {
		return 1 + (int) (Math.random() * 100000);
	}

	/**
	 * The method for finding a key in the list
	 *
	 * @param list
	 * @param key
	 * @return
	 */
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Use binary search to find the key in the list
	 *
	 * @param list
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]) {
				high = mid - 1;
			} else if (key == list[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return -low - 1;  // Now high < low, key not found
	}

	/**
	 * The method for sorting the numbers
	 *
	 * @param list
	 */
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i...list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = (int) currentMin;
			}
		}
	}
}
