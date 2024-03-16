package com.practisetree;

public class SizeOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        int size = getSizeOfBinaryTree(root);
        System.out.println("Size of Binary tree is: " + getSizeOfBinaryTree(root));
    }

    //TC:O(N)  SC:O(h)
    private static int getSizeOfBinaryTree(Node root) {
        if (root == null) return 0;
        return 1 + getSizeOfBinaryTree(root.left) + getSizeOfBinaryTree(root.right);
    }
}
