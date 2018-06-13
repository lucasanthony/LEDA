package adt.stack;

import adt.linkedList.DoubleLinkedList;
import adt.linkedList.DoubleLinkedListImpl;

public class StackDoubleLinkedListImpl<T> implements Stack<T> {

   protected DoubleLinkedList<T> top;
   protected int size;

   public StackDoubleLinkedListImpl(int size) {
      this.size = size;
      this.top = new DoubleLinkedListImpl<T>();
   }

   @Override
   public void push(T element) throws StackOverflowException {
      if (isFull()) {
         throw new StackOverflowException();
      }

      this.top.insert(element);

   }

   @Override
   public T pop() throws StackUnderflowException {
      if (this.isEmpty()) {
         throw new StackUnderflowException();
      }

      T retorno = this.top();
      this.top.removeLast();
      return retorno;
   }

   @Override
   public T top() {
      T retorno = null;
      if (!isEmpty()) {
         retorno = ((DoubleLinkedListImpl<T>) this.top).getLast().getData();
      }
      return retorno;
   }

   @Override
   public boolean isEmpty() {
      return this.top.isEmpty();
   }

   @Override
   public boolean isFull() {
      return (this.top.size() == this.size);
   }

}
