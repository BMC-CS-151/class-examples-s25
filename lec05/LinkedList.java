public class LinkedList<T> {

  private Node head;

  public LinkedList() {
    head = new Node();
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

  public Node find(T data) {
    //start at the head and loop until 
    // (a) you hit the tail (node.next == null) OR
    // (b) you find the element (current node.data.equals(data))

    Node node = head;

    while (node != null) {
        if (node.data != null && node.data.equals(data)) {
            return node;
        }
        node = node.next;
    }
  }


  public void insertHead(T data) {

    // 1. Create new node
    Node newNode = new Node(data);
    // 2. have new node next point to first element
    newNode.next = head.next;
    // 3. update the head to point to the new node
    head.next = newNode;
  }

  public void insertTail(T data) {
    // 1. create a new node
    Node newNode = new Node(data);
    // 2. find the last node
    
    Node lastNode = head;
    while (node.next != null) {
        lastNode = node.next;
    }

    // 3. make the last node point to newest
    lastNode.next = newNode;
  }


  public void remove(T data) {
    // 1. find the node to remove 
    Node cur = head;
    Node prev = null;
    while (cur != null) {
        if (cur.data != null && cur.data.equals(data)) {
            break;
           //found node to remove   
        }

        prev = cur;
        cur = cur.next;
    }

    // 2. fix the left node to point to something
    prev.next = cur.next;

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
