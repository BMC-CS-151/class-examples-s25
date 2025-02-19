public class StackLL<E> {
    private LinkedList<E> ll; //SLL with tail

    public StackLL() {
        this.ll = new LinkedList<E>();
    }

    public boolean isEmpty() {
        return ll.size() == 0;
    }

    public void push(E data) {
        ll.insertHead(data);
    }

    public E pop() {
       E elem = ll.removeHead(); 
       return elem;
    }

    public E peek() {
        return ll.firstElem();
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); //30

        stack.pop();
        stack.pop();

        System.out.println("Top element after popping: " + stack.peek()); //10
    }
}
