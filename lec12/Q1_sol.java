public Node rearrangeEvenOdd(LinkedList ll) {
    Node itr = ll.head.next; 
    Node o = itr.next;

    Node oddHead = itr.next;
    
    while (itr != null) {

        itr.next = itr.next.next;
        o.next = o.next.next;

        
        itr = itr.next;
        o = o.next;
    }

    itr.next = oddHead;

}
