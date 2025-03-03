public boolean isBanaced(String s) {
    Stack<Character> stack = new Stack<Character>();

    if (s.length() % 2 == 1) return false;
    
    for (int i=0; i<s.length(); i++) {
    
        Character c = s.charAt(i);

        if (c == '(' || c == '{' || c =='[') {
            stack.push(c);
        } else if (c == ')'  && sack.peek() == '(') {
            stack.pop();
        } else if (c == '}' && stack.peek() == '{') {
            stack.pop();
        }  else if (c == ']' && stack.peek() == '[') {
            stack.pop();
        } else {
            return false;
    }
    return true;
}
