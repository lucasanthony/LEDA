import adt.linkedList.DoubleLinkedListImpl;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedListImpl dlinked = new DoubleLinkedListImpl<Integer>();

		dlinked.insert(1);
		dlinked.insert(2);
		dlinked.insert(3);
		dlinked.insert(4);
		dlinked.insert(5);
		System.out.println(dlinked.getLast());
		dlinked.remove(5);
		System.out.println(dlinked.getLast());
	}

}
