package com.linkedlist;

import static com.linkedlist.traversingofLL.printlist;

public class ReverseLLIterative1 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.print("Before Reverse: ");
        printlist(head);
        System.out.println();
        System.out.print("After Reverse: ");
        Node temp = reverserecur(head);
        printlist(temp);
    }

    //TC:O(N) SC:O(1)
    private static Node reverserecur(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
