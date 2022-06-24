package sorting.simpleSorting;

import sorting.AbstractSorting;

import static util.Util.swap;
/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		System.out.println(" ");
		if (leftIndex > array.length || rightIndex > array.length) {
			return;

		} else {

			for (int i = leftIndex; i <= rightIndex; i++) {

				int j = i;

				while (j > leftIndex && (array[j].compareTo(array[j - 1]) < 0)) {
					swap(array, j, j - 1);
					j--;


				}
			}
		}

	}
	
}
