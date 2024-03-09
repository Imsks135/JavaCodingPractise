package com.linkedlist;

import static com.linkedlist.traversingofLL.printlist;

public class RemoveDupInSortedLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(40);
        System.out.print("Before Removing Duplicates: ");
        printlist(head);
        removedups(head);
        System.out.println();
        System.out.print("After Removing Duplicates: ");
        printlist(head);
    }

    private static void removedups(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.value == curr.next.value) {
                curr.next = curr.next.next;
            } else curr = curr.next;
        }
    }
}
