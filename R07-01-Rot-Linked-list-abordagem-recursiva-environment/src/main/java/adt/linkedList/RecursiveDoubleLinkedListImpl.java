package adt.linkedList;

public class RecursiveDoubleLinkedListImpl<T> extends RecursiveSingleLinkedListImpl<T> implements DoubleLinkedList<T> {

	protected RecursiveDoubleLinkedListImpl<T> previous;

	public RecursiveDoubleLinkedListImpl() {

	}

	public RecursiveDoubleLinkedListImpl(T data, RecursiveSingleLinkedListImpl<T> next,
			RecursiveDoubleLinkedListImpl<T> previous) {
		super(data, next);
		this.previous = previous;
	}

	@Override
	public void insert(T element) {
		if (element != null) {
			RecursiveDoubleLinkedListImpl<T> nil = new RecursiveDoubleLinkedListImpl<T>();
			if (this.isEmpty()) {
				this.setData(element);
				this.setNext(nil);
				this.setPrevious(nil);
			}

			else {
				RecursiveDoubleLinkedListImpl<T> newLast = new RecursiveDoubleLinkedListImpl<T>(element, nil,
						getLast());
				getLast().setNext(newLast);
			}
		}
	}

	@Override
	public void insertFirst(T element) {
		if (element != null) {
			if (!this.isEmpty()) {
				RecursiveDoubleLinkedListImpl<T> nil = new RecursiveDoubleLinkedListImpl<T>();
				RecursiveDoubleLinkedListImpl<T> head = new RecursiveDoubleLinkedListImpl<T>(element, this, nil);
				RecursiveDoubleLinkedListImpl<T> aux = new RecursiveDoubleLinkedListImpl<T>(this.getData(),
						this.getNext(), head);
				this.setData(element);
				this.setNext(aux);
			}

			else {
				insert(element);
			}
		}
	}

	@Override
	public void removeFirst() {
		if (!isEmpty()) {
			if (this.size() == 1)
				this.setData(null);

			else {
				this.setData(this.getNext().getData());
				this.setNext(this.getNext().getNext());
			}
		}
	}

	@Override
	public void removeLast() {
		if (!isEmpty()) {
			if (this.size() == 1)
				this.setData(null);

			else {
				RecursiveDoubleLinkedListImpl<T> nil = new RecursiveDoubleLinkedListImpl<T>();
				getLast().getPrevious().setNext(nil);
			}
		}
	}

	@Override
	public void remove(T element) {
		if (!this.isEmpty()) {

			if (!this.getData().equals(element))
				this.getNext().remove(element);

			else if (this.getPrevious().getData() == null)
				removeFirst();

			else if (this.equals(this.getLast()))
				removeLast();

			else {
				RecursiveDoubleLinkedListImpl<T> firstHalf = this.getPrevious();
				RecursiveDoubleLinkedListImpl<T> lastHalf = (RecursiveDoubleLinkedListImpl<T>) this.getNext();
				firstHalf.setNext(lastHalf);
				lastHalf.setPrevious(firstHalf);

			}
		}
	}

	/**
	 * Metodo que retorna o ultimo "no" da lista, utilizando recursao
	 * 
	 * @return
	 */
	public RecursiveDoubleLinkedListImpl<T> getLast() {
		if (!isEmpty()) {
			if (this.getNext().getData() == null)
				return this;

			else
				return ((RecursiveDoubleLinkedListImpl<T>) this.getNext()).getLast();
		}

		return null;
	}

	public RecursiveDoubleLinkedListImpl<T> getPrevious() {
		return previous;
	}

	public void setPrevious(RecursiveDoubleLinkedListImpl<T> previous) {
		this.previous = previous;
	}

}
