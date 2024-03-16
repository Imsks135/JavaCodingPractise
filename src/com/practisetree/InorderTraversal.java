package com.practisetree;

class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

public class InorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        inorderTraversal(root);
    }

    //TC:O(N) SC:O(h)
    static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }
}
