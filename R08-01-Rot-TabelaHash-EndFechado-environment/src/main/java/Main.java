import adt.hashtable.closed.HashtableClosedAddressImpl;
import adt.hashtable.hashfunction.HashFunctionClosedAddressMethod;

public class Main {

	public static void main(String[] args) {
		HashtableClosedAddressImpl<Integer> table = new HashtableClosedAddressImpl<>(10,
				HashFunctionClosedAddressMethod.DIVISION);
		
		for (int i = 0; i < 100; i+=3) {
			table.insert(i);
		}
		System.out.println(table.getCOLLISIONS());
		table.remove(12);
		table.remove(13);
		table.remove(1);
		System.out.println(table.isFull());
		System.out.println(table.capacity());
	}

}
