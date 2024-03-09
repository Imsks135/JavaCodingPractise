package com.linkedlist;

public class DetectLoopFloydCycle {
    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
        if (isLoopExists(head)) System.out.println("Loop Exists");
        else System.out.println("Loop Not Exists");
    }

    //TC:O(N) SC:O(1)
    private static boolean isLoopExists(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
