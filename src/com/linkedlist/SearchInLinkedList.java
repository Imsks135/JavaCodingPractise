package com.linkedlist;

public class SearchInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        int x = 40;
        int temp = searchinLL(head, x);
        if (temp != 0) {
            System.out.println("The position of " + x + " is " + temp);
        } else System.out.println("Not found");
    }

    private static int searchinLL(Node head, int x) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.value == x) return pos;
            else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
}
