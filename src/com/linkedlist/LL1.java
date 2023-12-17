package com.linkedlist;


import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Save the next node
            current.next = prev; // Reverse the link

            // Move one step forward in the list
            prev = current;
            current = next;
        }

        head = prev; // Set the new head
    }

    public void addNodesFromInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter the data for each node:");

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            append(data);
        }

        sc.close();
    }
}

public class LL1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.append(10);
//        ll.append(20);
//        ll.append(30);
        ll.addNodesFromInput();
        System.out.println("Original LinkedList are:");
        ll.display();
        System.out.println("Reversed LinkedList are:");
        ll.reverse();
        ll.display();
    }
}
