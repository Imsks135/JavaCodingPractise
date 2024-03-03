package com.linkedlist;

import static com.linkedlist.traversingofLL.printlist;

public class InsertAtBeginOfSLL {
    public static void main(String[] args) {
        Node head = null;
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 10);
        head = insertAtBegin(head, 5);
        printlist(head);
    }
//TC:O(1)
    private static Node insertAtBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }
}
