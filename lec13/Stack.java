public void sortStack(Stack<Integer> s) {

    Stack<Integer> tmpStack = new Stack<Integer>();

    while (!s.isEmpty()) {
        int current = s.pop();

        while (!tmpStack.isEmpty() && tmpStack.peek() > current) {
            stack.push(tmpStack.pop());
        }


        tmpStack.push(current);

    }

    while (!tmpStack.isEmpty()) {
        stack.push(tmpStack.pop());
    }
}
