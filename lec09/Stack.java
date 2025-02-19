public class Stack<E> {
    private int top;
    private E[] array; //let's assume a fixed 100 size array

    public Stack() {
        this.top = -1;
        this.array = (E[]) new Object[100]; 
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(E data) {
        //Case 2: array is full - throw exception 
        if (top == array.length) {
            throw new RuntimeException("full array");
        }

        //Case 1: array is not full
        array[top+1] = data;

        top += 1;

    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("cant pop off an empty stack");
        }
        //Case 2: array is non-empty;
        E elem = array[top];

        array[top] = null;
        top -= 1;

        return elem;
    }

    public E peek() {
        //Case 1: array is empty... throw exception;
        if (isEmpty()) {
            throw new RuntimeException("cant peek an empty stack");
        }

        //Case 2: array is non-empty;

        return array[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        //top = -1, []
        stack.push(10); 
        //top = 0, [10, .....]
        stack.push(20);
        //top = 1, [10,20,.....]
        stack.push(30);
        //top = 2, [10,20,30, ...]

        System.out.println("Top element: " + stack.peek()); //30

        stack.pop();
        //top = 1, [10,20,x30x, ...]
        stack.pop();
        //top = 0, [10,x20x,x30x, ...]

        System.out.println("Top element after popping: " + stack.peek()); //10

        stack.pop();
        System.out.println(stack.isEmpty()); //true
    }
}
