public class LinkedBinaryTreeImpl<E extends Comparable<E>> {
    Node<E> root;

    public LinkedBinaryTreeImpl() {
        root = null;
    }

    public LinkedBinaryTreeImpl(E data) {
        root = new Node(data);
    }

    private class Node<E> {
        private E element;
        private Node<E> left;
        private Node<E> right;

        public Node() {
            //init empty tree
            this.left = null;
            this.right = null;
        }

        public Node(E data) {
            this.element = data;
            this.left = null;
            this.right = null;
        }

    }

    public Node search(E key) {
        return search(root, key);
    }

    private Node search(Node node, E key) {
        if (node == null) {
            return null;
        }

        //CASE 1: we found it!
        if (key.compareTo((E) node.element) == 0) {
            return node;
        }

        //CASE 2: larger than
        if (key.compareTo((E) node.element) > 0) {
            return search(node.right, key);
        } 

        //(key.compareTo((E) node.element) < 0) {
        //CASE 3: smaller than
        return search(node.left, key);
    }
}
