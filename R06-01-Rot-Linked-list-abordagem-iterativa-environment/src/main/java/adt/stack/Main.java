package adt.stack;

import adt.linkedList.DoubleLinkedListImpl;
import adt.linkedList.SingleLinkedListImpl;
import adt.queue.QueueDoubleLinkedListImpl;
import adt.queue.QueueOverflowException;
import adt.queue.QueueUnderflowException;

public class Main {

	public static void main(String[] args)
			throws QueueOverflowException, QueueUnderflowException, StackOverflowException, StackUnderflowException {
		QueueDoubleLinkedListImpl filaLinked = new QueueDoubleLinkedListImpl<Integer>(1);
		StackDoubleLinkedListImpl pilhaLinked = new StackDoubleLinkedListImpl<Integer>(3);
		DoubleLinkedListImpl dlinked = new DoubleLinkedListImpl<Integer>();
		SingleLinkedListImpl slinked = new SingleLinkedListImpl<Integer>();
		
		dlinked.insert(1);
		dlinked.insert(2);
		dlinked.insert(3);
		dlinked.remove(2);
		
		
//		filaLinked.enqueue(1);
//		filaLinked.enqueue(2);
//		filaLinked.enqueue(3);
//		filaLinked.head();
//		filaLinked.dequeue();
//		filaLinked.head();
		
//		pilhaLinked.push(1);
//		pilhaLinked.push(2);
//		pilhaLinked.push(3);
//		System.out.println(pilhaLinked.isFull());
//		pilhaLinked.pop();
//		System.out.println(pilhaLinked.isFull());
		
	}

}
