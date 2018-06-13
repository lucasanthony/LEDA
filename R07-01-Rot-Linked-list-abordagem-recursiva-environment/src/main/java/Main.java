import java.util.Arrays;

import adt.linkedList.RecursiveDoubleLinkedListImpl;
import adt.linkedList.RecursiveSingleLinkedListImpl;

public class Main {

   public static void main(String[] args) {
      RecursiveSingleLinkedListImpl<Integer> single = new RecursiveSingleLinkedListImpl<Integer>();
      RecursiveDoubleLinkedListImpl<Integer> dlinked = new RecursiveDoubleLinkedListImpl<Integer>();

      		single.insert(1);
      		single.insert(2);
      		single.insert(3);
      		single.insert(4);
      		single.insert(5);
      		System.out.println(single.size()); // 5
      		System.out.println(single.search(3)); // 3
      		System.out.println(Arrays.toString(single.toArray())); // [1,2,3,4,5]
      		single.remove(5);
      		System.out.println(single.size()); // 4
      		System.out.println(Arrays.toString(single.toArray())); // [1,2,3,4]
      		System.out.println(single.search(3)); // 3

      //dlinked.insert(1);
//      System.out.println(dlinked.size()); // 0
//      dlinked.insertFirst(3);
//      System.out.println(dlinked.search(3)); // 3
//      dlinked.remove(3);
//      System.out.println(dlinked.search(3)); // null
//      dlinked.insert(1);
//      dlinked.insert(2);
//      System.out.println(dlinked.size()); // 2
      
      //		System.out.println(Arrays.toString(single.toArray()));

      //		dlinked.insertFirst(1);
      //		dlinked.insertFirst(2);
      //		dlinked.insertFirst(3);
      //		dlinked.insertFirst(4);
      //		dlinked.insertFirst(12);
      //		dlinked.insert(1);
      //		dlinked.insert(2);
      //		dlinked.insert(3);
      //		dlinked.insert(4);
      //		//dlinked.removeLast();
      //		dlinked.remove(4);
      //		System.out.println(dlinked.getLast().getData());
   }

}
