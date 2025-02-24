public class QueueLL implements Queue<E> {
    private LinkedList ll; //SLL with tail
    private int size;

    /**
     * Returns the number of elements in the queue.
     * @return number of elements in the queue
     */
    public int size() {
        return size;
    }

    /**
     * Tests whether the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Inserts an element at the rear of the queue.
     * @param e     the element to be inserted
     */
    public void enqueue(E e) {

    }

    /**
     * Returns, but does not remove, the first element of the queue.
     * @return top element in the queue (or null if empty)
     */
    public E first() {
        
    }

    /**
     * Removes and returns the first element from the queue.
     * @return element removed (or null if empty)
     */
    public E dequeue() {
        return ll.removeHead();
    }
}
