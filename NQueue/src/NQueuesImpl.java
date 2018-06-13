
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
  
  	/*
17  	 * ATENCAO!! Eh terminantemente proibido criar outros atributos para esta
18  	 * classe.
19  	 */
  
  	private T[] array; // array contendo todos os elementos da fila
  	private int tail[]; // array para armazenar os tails
  	private int size; // tamanho de cada fila
  	private int n; // numero de filas
  
  	/**
27  	 * Cria uma estrutura com n filas de determinado tamanho
28  	 * 
29  	 * @param n
30  	 *            eh a quantidade de filas
31  	 * @param size
32  	 *            eh o tamanho de cada fila
33  	 */
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
  
  	/*
47  	 * (non-Javadoc)
48  	 * 
49  	 * @see adt.queue.NQueues#enqueue(java.lang.Object, int) Adiciona o elemento T
50  	 * na k-esima fila. Se o elemento for null a fila nao eh modificada. Lanca
51  	 * QueueOverflowException se a fila estiver cheia
52  	 */
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
  
  	/*
66  	 * (non-Javadoc)
67  	 * 
68  	 * @see adt.queue.NQueues#dequeue(int) Remove (e retorna) o mais entigo elemento
69  	 * que foi inserido na k-esima fila. Lanca QueueUnderflowException se a fila
70  	 * estiver vazia.
71  	 */
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
  
  	/*
88  	 * (non-Javadoc)
89  	 * 
90  	 * @see adt.queue.NQueues#head(int) Retorna (sem remover) o mais entigo elemento
91  	 * que foi inserido na k-esima fila.
92  	 */
  	public T head(int k) {
  			return array[size*k];

  	}
  
 	/*
101 	 * (non-Javadoc)
102 	 * 
103 	 * @see adt.queue.NQueues#isEmpty(int) Retorna true se a k-esima fila estiver
104 	 * vazia; ou false caso contrario.
105 	 */
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
 
 	/*
120 	 * (non-Javadoc)
121 	 * 
122 	 * @see adt.queue.NQueues#isFull(int) Retorna true se a k-esima fila estiver
123 	 * cheia; ou false caso contrario.
124 	 */
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
