public interface BinaryTree<E extends Comparable<E>> {
    /** 
     * Determines the number of elements in the tree.
     *
     * @return int - the number of elements
     */
    int size();

    /** 
     * Determines if the tree is empty.
     *
     * @return true if empty, false otherwise
     */
    boolean isEmpty();

    /** 
     * Inserts an element into the tree.
     *
     * @param element - the element to insert
     */
    void insert(E element);

    /** 
     * Determines if the tree contains a specific element.
     *
     * @param element - the element to search for
     * @return a boolean if the item was found
     */
    boolean contains(E element);
 
    /** 
     * Computes the height of the tree.
     *
     * @return the height as an int
     */
    int height();

    /** 
     * Creates a string representation of the elements in the tree,
     * the string should be based on an in-order traversal.
     *
     * @return A string representation of the elements in the tree
     */
    String toString();
}

