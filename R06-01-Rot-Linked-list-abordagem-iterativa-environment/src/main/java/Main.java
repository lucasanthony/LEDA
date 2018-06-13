import java.util.Arrays;

import adt.linkedList.DoubleLinkedListImpl;
import adt.linkedList.SingleLinkedListImpl;

public class Main {

	public static void main(String[] args) {
		SingleLinkedListImpl<Integer> single = new SingleLinkedListImpl<Integer>();
		
		single.insereOrdenado(5);
		single.insereOrdenado(4);
		single.insereOrdenado(3);
		single.insereOrdenado(30);
		single.insereOrdenado(0);
		single.insereOrdenado(2);
		single.insereOrdenado(1);
		System.out.println(Arrays.toString(single.toArray()));
		
	}

}
