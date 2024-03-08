package com.linkedlist;

import static com.linkedlist.traversingofLL.printlist;

public class InsertAtGivenPos {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.print("Before Insertion:");
        printlist(head);
        System.out.println();
        int pos = 4;
        int x = 35;
        Node temp1 = insertAtPos(head, pos, x);
        System.out.println("After Insertion:");
        printlist(temp1);
    }

    private static Node insertAtPos(Node head, int pos, int x) {
        Node temp = new Node(x);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
