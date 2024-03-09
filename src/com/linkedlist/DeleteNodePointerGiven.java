package com.linkedlist;

import static com.linkedlist.traversingofLL.printlist;

public class DeleteNodePointerGiven {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        Node ptr = new Node(30);
        head.next.next = ptr;
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(25);
        System.out.print("Before Deleting ptr Node:");
        printlist(head);
        deleteptrNode(ptr);
        System.out.println();
        System.out.print("After Deleting ptr Node:");
        printlist(head);
    }

    //TC:O(1) SC:O(1)
    private static void deleteptrNode(Node ptr) {
        Node temp = ptr.next;
        ptr.value = temp.value;
        ptr.next = temp.next;
    }
}
