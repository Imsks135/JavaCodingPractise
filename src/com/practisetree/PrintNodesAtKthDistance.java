package com.practisetree;

public class PrintNodesAtKthDistance {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        int k = 2;
        printNodeAtKth(root, k);
    }

    //TC:O(N) SC:O(h) worst case TC:theta(N) SC:theta(h)
    private static void printNodeAtKth(Node root, int k) {
        if (root == null) return;
        if (k == 0) System.out.print(root.key + " ");
        else {
            printNodeAtKth(root.left, k - 1);
            printNodeAtKth(root.right, k - 1);
        }
    }
}
