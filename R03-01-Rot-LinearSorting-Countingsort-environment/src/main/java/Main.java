import java.util.Arrays;

import sorting.linearSorting.ExtendedCountingSort;

public class Main {

   public static void main(String[] args) {
      ExtendedCountingSort count = new ExtendedCountingSort();

      Integer[] array = { 10, 9, 8, 7, -6, 35, 5, 4, 3, 2, 1 };

      count.sort(array, 0, array.length - 1);

      System.out.println(Arrays.toString(array));

   }

}
