package adt.linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
	}

	@Override
	public boolean isEmpty() {
		return this.getHead().isNIL();
	}

	@Override
	public int size() {
		SingleLinkedListNode<T> aux = this.getHead();
		int retorno = 0;
		while (!aux.isNIL()) {
			retorno++;
			aux = aux.getNext();
		}
		return retorno;
	}

	@Override
	public T search(T element) {
		T retorno = null;
		SingleLinkedListNode<T> aux = this.getHead();
		while (!aux.isNIL()) {
			if (aux.getData().equals(element)) {
				retorno = aux.getData();
			}
			aux = aux.getNext();

		}
		return retorno;
	}

	@Override
	public void insert(T element) {
		if (element != null) {
			if (this.isEmpty()) {
				this.getHead().setData(element);
				this.getHead().setNext(new SingleLinkedListNode<>());
			}

			else {
				SingleLinkedListNode<T> aux = this.getHead();
				while (!aux.isNIL()) {
					aux = aux.getNext();
				}

				aux.setData(element);
				aux.setNext(new SingleLinkedListNode<>());
			}
		}
	}

	@Override
	public void remove(T element) {
		if (!this.isEmpty() || this.search(element) != null) {
			SingleLinkedListNode<T> aux = this.getHead();

			if (aux.getData().equals(element))
				this.setHead(aux.getNext());

			else {
				while (aux.getNext().getData() != element) {
					aux = aux.getNext();
				}
				aux.setNext(aux.getNext().getNext());
			}
		}
	}

	@Override
	public T[] toArray() {
		Object[] array = new Object[this.size()];
		SingleLinkedListNode<T> aux = this.getHead();
		for (int i = 0; i < this.size(); i++) {
			array[i] = aux.getData();
			aux = aux.getNext();
		}
		return (T[]) array;
	}

	public void insereOrdenado(T element) {
		if (this.isEmpty())
			insert(element);

		else if ((int) element < (int) this.head.getData()) {
			SingleLinkedListNode<T> headAux = this.head;
			this.setHead(new SingleLinkedListNode<T>(element, headAux));
		}

		else {
			SingleLinkedListNode<T> node = this.head;
			while (!node.getNext().isNIL() && (int) node.getData() < (int) element
					&& (int) node.getNext().getData() < (int) element)
				node = node.getNext();

			if (node.getNext().isNIL())
				node.setNext(new SingleLinkedListNode<T>(element, new SingleLinkedListNode<>()));

			else {
				SingleLinkedListNode<T> aux = node.getNext();
				node.setNext(new SingleLinkedListNode<T>(element, aux));
			}
		}
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}
