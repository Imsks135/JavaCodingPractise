package com.linkedlist;

import java.util.ArrayList;

import static com.linkedlist.traversingofLL.printlist;

public class ReverseLLIterative {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.print("Before Reverse: ");
        printlist(head);
        System.out.println();
        Node temp = reverseiter(head);
        System.out.print("After Reverse: ");
        printlist(temp);
    }

    //TC:O(N) SC:O(N)
    private static Node reverseiter(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            arr.add(curr.value);
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            curr.value = arr.remove(arr.size() - 1);
        }
        return head;
    }
}
