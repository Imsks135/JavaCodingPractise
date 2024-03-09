package com.linkedlist;

class Node {
    int value;
    Node next;

    Node(int x) {
        value = x;
        next = null;
    }
}

public class traversingofLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
    }

    //TC:O(N) N=number of nodes
    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }
}
