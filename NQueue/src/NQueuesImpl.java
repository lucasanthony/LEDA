
   /**
4    * 
5    * Cria uma estrutura de dados nQueues que representa n filas de um determinado
6    * tamanho. A implementacao deve usar apenas um unico array para armazenar todos
7    * os elementos de todas as filas.
8    * 
9    * @author campelo
10   *
11   * @param <T>
12   *            o tipo de elemento a ser armazenado nas filas
13   */
  public class NQueuesImpl<T> implements NQueues<T> {
  
  	private T[] array; // array contendo todos os elementos da fila
  	private int tail[]; // array para armazenar os tails
  	private int size; // tamanho de cada fila
  	private int n; // numero de filas
  
  	public NQueuesImpl(int n, int size) {
  		this.array = (T[]) new Object[size];
  		this.n = n;
  		this.size = size;
  		this.tail = new int[n];
  		this.tail[0] = -1;
  		for (int i = 1; i < n; i++) {
  			this.tail[i] = (i * size) - 1;
  		}
  	}
  
  	public void enqueue(T element, int k) throws QueueOverflowException {
  		if (element != null) {
  			if (isFull(k)) {
  				array[++tail[k]] = element;
  			}
  			
  			else {
  				throw new QueueOverflowException();
  			}
  		}
  	}
  
  	public T dequeue(int k) throws QueueUnderflowException {
  		if (k < tail.length) {
  			if (isEmpty(k)) {
  				throw new QueueUnderflowException();
  			}
  
  			else {
  				T aux = this.head(k);
  				shiftLeft(k);
  				return aux;
  			}
  		}
  		return null;
  	}
 
  	public T head(int k) {
  			return array[size*k];

  	}
  
 	public boolean isEmpty(int k) {
 		if (k > 0) {
 			int index = (array.length / n) * k - (array.length / n);
 			int indexFinal = (array.length / n) * k + 1;
 			for (int i = index; i < indexFinal; i++) {
 				if (this.array[i] != null) {
 					return false;
 				}
 			}
 		}
 		return true;
 	}
 
 	public boolean isFull(int k) {
 		if (k > 0) {
 			int indexFinal = (array.length / n) * k;
 			if (this.tail[k - 1] < indexFinal-1) {
 				return false;
 			}
 		}
 
 		return true;
 	}
 
 	private void shiftLeft(int k) {
 		int index = (array.length / n) * k - (array.length / n);
 		int indexFinal = (array.length / n) * k -1;
 		for (int i = index; i < indexFinal - 1; i++) {
 			this.array[i] = this.array[i + 1];
 		}
 		this.tail[k-1]--;
 	}
	 
 }
