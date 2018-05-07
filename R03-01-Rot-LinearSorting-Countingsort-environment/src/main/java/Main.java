import java.util.Arrays;

import sorting.linearSorting.CountingSort;

public class Main {

	public static void main(String[] args) {
		CountingSort count = new CountingSort();
		
		Integer[] array = {10,9,8,7,6,0,5,4,3,2,1};
		
		count.sort(array, 2, 9);
		
		System.out.println(Arrays.toString(array));

	}

}
