
public class Main {

	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		NQueuesImpl<Integer> fila = new NQueuesImpl<>(3, 5);
		
		fila.enqueue(10, 1);
		fila.enqueue(20, 1);
		fila.enqueue(30, 1);
		fila.enqueue(35, 1);
		fila.enqueue(34, 1);
		//fila.dequeue(3);
		
		System.out.println(fila.isEmpty(1));
		System.out.println("fila cheia:" + fila.isFull(1));
		System.out.println(fila.head(1));
		//fila.dequeue(1);
		System.out.println(fila.head(1));
		System.out.println("Elemento retirado, fila cheia:" + fila.isFull(1));
		fila.enqueue(40, 2);
		fila.dequeue(2);
		System.out.println(fila.head(2));
		fila.dequeue(2);

	}

}
