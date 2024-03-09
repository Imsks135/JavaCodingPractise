package com.linkedlist;

public class MiddleLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.print("Middle Node Value is: ");
        findmiddlenode(head);
    }

    //TC:O(N) SC:O(1)
    private static void findmiddlenode(Node head) {
        if (head == null) return;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.value);
    }
}
