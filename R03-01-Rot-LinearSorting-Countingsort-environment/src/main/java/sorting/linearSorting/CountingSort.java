package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala. Procure
 * evitar desperdicio de memoria alocando o array de contadores com o tamanho
 * sendo o máximo inteiro presente no array a ser ordenado.
 * 
 */
public class CountingSort extends AbstractSorting<Integer> {

   @Override
   public void sort(Integer[] array, int leftIndex, int rightIndex) {
      if (array != null && leftIndex >= 0 && rightIndex < array.length && leftIndex < rightIndex && array.length > 0) {
         Integer[] retorno = new Integer[(rightIndex + 1) - leftIndex];
         int maior = array[leftIndex];
         for (int i = leftIndex; i <= rightIndex; i++) {
            if (array[i] > maior) {
               maior = array[i];
            }
         }
         Integer[] contadores = new Integer[maior + 1];

         for (int i = 0; i < contadores.length; i++) {
            contadores[i] = 0;
         }

         for (int i = leftIndex; i <= rightIndex; i++) {
            contadores[array[i]]++;
         }

         for (int i = 1; i < contadores.length; i++) {
            contadores[i] = contadores[i] + contadores[i - 1];
         }

         for (int i = rightIndex; i >= leftIndex; i--) {
            int index = contadores[array[i]] - 1;
            retorno[index] = array[i];
            contadores[array[i]]--;
         }
         
         int j = 0;
         for (int i = leftIndex; i <= rightIndex; i++) {
            array[i] = retorno[j];
            j++;
         }

      }
   }

}
