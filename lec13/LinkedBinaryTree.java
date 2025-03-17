public class LinkedBinaryTree<E extends Comparable<E>> {
    Node<E> root;

    public LinkedBinaryTree() {
        root = null;
    }

    public LinkedBinaryTree(E data) {
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

    //node that the subtree we are searching is rooted at
    private Node search(Node node, E key) {
        //base case
        if (node == null) return null;
        //CASE 1: we found it!
        if (node.data.equals(key)) return node;
       //CASE 2: key is larger than the node.element
        if (key > node.data) { //USE COMPARETO
            //search to the right
            return search(node.right, key);
        } else if (key < node.data) 
            //search to the left
            //CASE 3: key is smaller than the node.element
            return search(node.left, key);
        }
    }
}
