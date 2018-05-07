import sorting.linearSorting.CountingSort;

public class Main {

	public static void main(String[] args) {
		CountingSort count = new CountingSort();
		
		Integer[] array = {6,6,3,1,5,6};
		
		count.sort(array, 0, 5);

	}

}
