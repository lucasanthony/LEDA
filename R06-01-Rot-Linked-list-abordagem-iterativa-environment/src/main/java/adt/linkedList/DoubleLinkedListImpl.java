package adt.linkedList;

public class DoubleLinkedListImpl<T> extends SingleLinkedListImpl<T> implements DoubleLinkedList<T> {

	protected DoubleLinkedListNode<T> last;

	public DoubleLinkedListImpl() {
		this.last = new DoubleLinkedListNode<>();
		super.setHead(this.last);
	}
	@Override
	public void insert(T element) {
		if (element != null) {
			DoubleLinkedListNode<T> nil = new DoubleLinkedListNode<>();
			DoubleLinkedListNode<T> newLast = new DoubleLinkedListNode<T>(element, nil, this.last);
			if (this.isEmpty()) {
				this.setLast(newLast);
				this.setHead(this.last);

			} else {
				this.getLast().setNext(newLast);
				this.setLast(newLast);
			}
		}
	}

	@Override
	public void insertFirst(T element) {
		if (element != null) {
			if (this.isEmpty()) {
				insert(element);
			}

			else {
				DoubleLinkedListNode<T> nil = new DoubleLinkedListNode<>();
				DoubleLinkedListNode<T> newHead = new DoubleLinkedListNode<T>(element,
						(DoubleLinkedListNode<T>) this.getHead(), nil);

				((DoubleLinkedListNode<T>) this.getHead()).setPrevious(newHead);
				this.setHead(newHead);
			}
		}
	}

	@Override
	public void removeFirst() {
		DoubleLinkedListNode<T> nil = new DoubleLinkedListNode<>();
		if (!isEmpty()) {
			if (this.size() == 1) {
				this.setHead(nil);
				this.setLast((DoubleLinkedListNode<T>) this.getHead());
			}

			else {
				// NOVA HEAD SERA O NEXT DA HEAD ATUAL
				this.setHead(this.getHead().getNext());
				((DoubleLinkedListNode<T>) this.getHead()).setPrevious(nil);
			}
		}
	}

	@Override
	public void removeLast() {
		DoubleLinkedListNode<T> nil = new DoubleLinkedListNode<>();
		if (!isEmpty()) {
			if (this.size() == 1) {
				this.setHead(nil);
				this.setLast((DoubleLinkedListNode<T>) this.getHead());
			}

			else {
				this.setLast(this.getLast().getPrevious());
				this.getLast().setNext(nil);
			}
		}

	}

	@Override
	public void remove(T element) {
		// VERIFICA SE A LISTA TEM ELEMENTOS E SE O ELEMENTO PASSADO EXISTE NA LISTA
		if (!this.isEmpty() && super.search(element) != null) {
			DoubleLinkedListNode<T> aux = (DoubleLinkedListNode<T>) this.getHead();

			while (aux.getData() != element)
				aux = (DoubleLinkedListNode<T>) aux.getNext();

			if (aux.equals(this.getHead()) || this.size() == 1)
				removeFirst();

			else if (aux.equals(this.getLast()))
				removeLast();

			else {
				DoubleLinkedListNode<T> firstHalf = aux.getPrevious();
				DoubleLinkedListNode<T> lastHalf = (DoubleLinkedListNode<T>) aux.getNext();

				firstHalf.setNext(lastHalf);
				lastHalf.setPrevious(firstHalf);
				
			}
		}
	}

	public DoubleLinkedListNode<T> getLast() {
		return last;
	}

	public void setLast(DoubleLinkedListNode<T> last) {
		this.last = last;
	}

}
