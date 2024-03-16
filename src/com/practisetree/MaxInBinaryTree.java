package com.practisetree;

public class MaxInBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        int maxValue = maxInBTree(root);
        System.out.println("Max Value In Btree is:" + maxValue);
    }

    //TC:O(N)  SC:O(h)
    private static int maxInBTree(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        else {
            return Math.max(root.key, Math.max(maxInBTree(root.left), maxInBTree(root.right)));
        }

    }
}
