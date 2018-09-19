package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;

/**
 * The combsort algoritm.
 */
public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex && leftIndex >= 0 && rightIndex < array.length && array != null) {
			int i = leftIndex;
			int j = rightIndex - leftIndex +1;
			int gap = (int) (j / 1.25);
			while (gap > 0) {
				if (i + gap > rightIndex) {
					j--;
					i = leftIndex;
					gap = (int) (j / 1.25);
				}
				if (array[i].compareTo(array[i + gap]) > 0)
					Util.swap(array, i, i + gap);

				i++;
			}
		}
	}
}
