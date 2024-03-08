package com.linkedlist;

import static com.linkedlist.traversingofLL.printlist;

public class DeleteFirstNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.print("Before Deleting:");
        printlist(head);
        Node temp = deletefirstnode(head);
        System.out.println();
        System.out.println("After Deleting:");
        printlist(temp);
    }

    //TC:O(1)
    private static Node deletefirstnode(Node head) {
        if (head == null) return null;
        else return head.next;
    }
}
