public class DoublyLinkedList<T> {

    private Node head;
    private Node tail; //NOTICE TAIL

    public DoublyLinkedList() {
        head = new Node();
        tail = new Node();

        head.next = tail; //In an empty linked list, head and tail point to eachother
        tail.prev = head;
    }

    private class Node<T> {

        public T data;
        public Node next;
        public Node prev;

        public Node() {
            this.next = null;
            this.prev = null;
        }

        public Node(T data) {
            this.data = data;
        }
    }

    //TODO 2: copy over and fix insertHead 
    public void insertHead(T data) {
        // new: fix prev and tail accordingly
        // 1. Create new node
        Node newNode = new Node(data);
        // 2. have new node next point to first element
        newNode.next = head.next;
        newNode.prev = head;

        // 3. update the head to point to the new node
        head.next.prev = newNode;
        head.next = newNode;
    }


    //TODO 3: copy over and fix insertTail 
    public void insertTail(T data) {
        // 1. create a new node
        Node newNode = new Node(data);

        newNode.next = tail;
        newNode.prev = tail.prev;

        // 3. make the last node point to newest
        tail.prev.next = newNode;
        tail.prev = newNode;

    }


    //TODO 4: copy over and fix remove
    public void remove(T data) {
        // 1. find the node to remove 
        Node cur = head;
        while (cur != null) {
            if (cur.data != null && cur.data.equals(data)) {
                break;
                //found node to remove   
            }

            cur = cur.next;
        }

        // 2. fix the left node to point to something
        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
    }

    //TODO 5: create an insertBefore method
    public void insertBefore(Node n, T newData) {
        Node newNode = new Node(newData);

        newNode.next = n; 
        newNode.prev = n.prev;

        n.prev.next = newNode;
        n.prev = newNode;

    }
}
