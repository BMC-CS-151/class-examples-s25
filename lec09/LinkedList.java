
public class LinkedList<T> {

    private int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        head = new Node();
        tail = new Node();
        size = 0;
    }

    private class Node<T> {

        public T data;
        public Node next;

        public Node() {
            this.next = null;
        }

        public Node(T data) {
            this.data = data;
        }
    }

    public T firstElem() {
        return (T) head.next.data;
    }

    public int size() {
        return size;
    }


    public Node find(T data) {
        Node node = head.next;
        while (node != null) {
            if (node.data.equals(data)) {
                return node;
            }

            node = node.next;
        }
        //start at the head and loop until 
        // (a) you hit the tail (node.next == null) OR
        // (b) you find the element (current node.data.equals(data))
        return null;
    }

    public T removeHead() {
        Node firstElem = head.next;
        head.next = head.next.next;
        
        //head.next.prev = head;
        return (T) firstElem.data;
        //firstElem.prev = head;
    }

    public void insertHead(T data) {
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
        // 1. Create new node
        // 2. have new node point to head
        // 3. update the head to point to the new node
        size += 1;
    }

    public void insertTail(T data) {
        Node newNode = new Node(data);
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }

        node.next = newNode;

        // 1. create a new node
        // 2. find the last node
        // 3. make the last node point to newest
        size += 1;
    }


    public void remove(T data) {
        Node node = head.next;
        Node leftNode = head;
        while (node.next != null) {
            if (node.data.equals(data)) {
                leftNode.next = node.next;
            }

            leftNode = node;
            node = node.next;
        }



        // 1. find the node to remove
        // 2. fix the left node to point to something
        size -= 1;
    }

    public void print() {
        Node currNode = head.next;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.print();

        list.insertTail(0);
        list.print();
        list.insertTail(1);
        list.print();
        list.insertHead(2);
        list.print();
    }

}
