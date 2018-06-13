import adt.hashtable.hashfunction.HashFunctionClosedAddressMethod;
import adt.hashtable.open.AbstractHashtableOpenAddress;
import adt.hashtable.open.HashtableElement;
import adt.hashtable.open.HashtableOpenAddressLinearProbingImpl;
import adt.hashtable.open.HashtableOpenAddressQuadraticProbingImpl;

public class Main {

   public static void main(String[] args) {
      AbstractHashtableOpenAddress<HashtableElement> table1 = new HashtableOpenAddressLinearProbingImpl<HashtableElement>(
            10, HashFunctionClosedAddressMethod.DIVISION);
      AbstractHashtableOpenAddress<HashtableElement> table2 = new HashtableOpenAddressQuadraticProbingImpl<HashtableElement>(
            10, HashFunctionClosedAddressMethod.DIVISION, 8, 12);

      table1.insert(new HashtableElement(1));
      table1.insert(new HashtableElement(22));
      table1.insert(new HashtableElement(15));
      table1.insert(new HashtableElement(7));
      table1.insert(new HashtableElement(31));
      table1.insert(new HashtableElement(33));
      table1.insert(new HashtableElement(345));
      System.out.println(table1.getCOLLISIONS());
      table2.insert(new HashtableElement(1));
      table2.insert(new HashtableElement(22));
      table2.insert(new HashtableElement(15));
      table2.insert(new HashtableElement(7));
      table2.insert(new HashtableElement(31));
      table2.insert(new HashtableElement(33));
      table2.insert(new HashtableElement(345));
      System.out.println(table2.getCOLLISIONS());
   }
}
