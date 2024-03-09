package com.linkedlist;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        int Nthpos = 2;
        printNthposfromEnd(head, Nthpos);
    }

    //TC:O(N) SC:O(1)
    private static void printNthposfromEnd(Node head, int nthpos) {
        if (head == null) return;
        Node first = head;
        for (int i = 0; i < nthpos; i++) {
            if (first == null) return;
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        System.out.println(nthpos + "nd Node from end is " + second.value);
    }
}
