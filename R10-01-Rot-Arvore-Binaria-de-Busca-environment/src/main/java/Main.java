import adt.bst.BSTImpl;

public class Main {

	public static void main(String[] args) {
		BSTImpl<Integer> bst = new BSTImpl<Integer>();

		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(7);
		bst.insert(3);
		bst.insert(13);
		bst.insert(17);
		System.out.println(bst.search(5));
	}

}
