
   
   /**
4    * 
5    * The interface of an NQueues. This is a data structure nQueues that represents n queues of a given size. 
6    * The implementation should use only one array, i.e., it should use the same 
7    * array for storing all elements.
8    * 
9    *  @author campelo
10   */
  public interface NQueues<T> {
  
  	/**
14  	 * Inserts a new element in the k-th queue or thorws an exception if the k-th queue
15  	 * is full. Null elements are not allowed (the queue remains unchanged).
16  	 * 
17  	 * @param element is the element to be added to the k-th queue
18  	 * @param k is the index of the queue to be manipulated (0 is the index of the first queue)
19  	 * 
20  	 * @throws QueueOverflowException
21  	 */
  	public void enqueue(T element, int k) throws QueueOverflowException;
  
  	/**
25  	 * If the k-th queue has elements, it removes the oldest one and returns it; 
26  	 * otherwise, it returns an exception.
27  	 * 
28  	 * @return the element removed from the k-th queue
29  	 * 
30  	 * @param k the index of the queue to be manipulated (0 is the index of the first queue)
31  	 * 
32  	 * @throws QueueUnderflowException if the k-th queue is empty
33  	 */
  	public T dequeue(int k) throws QueueUnderflowException;
  
  	/**
37  	 * Returns (without removing) the oldest element of the k-th queue; or 
38  	 * null if the queue is empty.
39  	 * 
40  	 * @return the oldest element of the k-th queue; or
41  	 * 
42  	 * @param k is the index of the queue to be manipulated (0 is the index of the first queue)
43  	 * 
44  	 * null if the queue is empty.
45  	 */
  	public T head(int k);
  
  	/**
49  	 * Returns true if the k-th queue is empty; or false, otherwise.
50  	 * 
51  	 * @return true if the k-th queue is empty; or false, otherwise.
52  	 * 
53  	 * @param k is the index of the queue to be manipulated (0 is the index of the first queue)
54  	 */
  	public boolean isEmpty(int k);
  	
  	/**
58  	 * Returns true if the k-th queue is full; or false, otherwise.
59  	 * 
60  	 * @return true if the k-th queue is full; or false, otherwise.
61  	 * 
62  	 * @param k is the index of the queue to be manipulated (0 is the index of the first queue)
63  	 */
  	public boolean isFull(int k);
  
  
  }
