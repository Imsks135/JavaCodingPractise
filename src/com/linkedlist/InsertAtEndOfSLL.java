package com.linkedlist;

import static com.linkedlist.traversingofLL.printlist;

public class InsertAtEndOfSLL {
    public static void main(String[] args) {
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        printlist(head);
    }

    //TC:O(1)
    private static Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) return temp;
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = temp;
        return head;
    }
}
