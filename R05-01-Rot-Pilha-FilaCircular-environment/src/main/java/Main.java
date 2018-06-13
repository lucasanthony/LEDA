import adt.queue.CircularQueue;
import adt.queue.QueueOverflowException;
import adt.queue.QueueUnderflowException;

public class Main {

	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		CircularQueue fila = new CircularQueue<Integer>(5);
		
		fila.enqueue(1);
		System.out.println(fila.dequeue());

	}

}
