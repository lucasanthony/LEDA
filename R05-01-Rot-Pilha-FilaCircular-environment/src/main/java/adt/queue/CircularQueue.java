package adt.queue;

public class CircularQueue<T> implements Queue<T> {

	private T[] array;
	private int tail;
	private int head;
	private int elements;

	public CircularQueue(int size) {
		array = (T[]) new Object[size];
		head = -1;
		tail = -1;
		elements = 0;
	}

	@Override
	public void enqueue(T element) throws QueueOverflowException {
		if (isFull())
			throw new QueueOverflowException();

		if (element != null) {
			if (tail == array.length - 1)
				tail = 0;

			else
				tail++;

			if (head == -1)
				head++;

			array[tail] = element;
			elements++;
		}
	}

	@Override
	public T dequeue() throws QueueUnderflowException {
		if (isEmpty())
			throw new QueueUnderflowException();

		T retorno = array[head];

		if (head == array.length - 1)
			head = 0;
		else
			head++;

		elements--;
		return retorno;
	}

	@Override
	public T head() {
		T retorno = null;
		if (!isEmpty())
			retorno = array[head];

		return retorno;
	}

	@Override
	public boolean isEmpty() {
		return (elements == 0);
	}

	@Override
	public boolean isFull() {
		return (elements == array.length);
	}

}
