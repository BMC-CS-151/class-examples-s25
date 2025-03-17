public void reverse() {

    Node prev = head;
    Node cur = head.next;
    Node next;
    while (cur != null) {
        next = cur.next;
        cur.next = prev;

        //move along other pointers
        prev = cur;
        cur = next;
    }
    head.next = prev;
}
