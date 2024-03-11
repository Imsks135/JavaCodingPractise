package com.practisetree;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.right.right = new Node(60);
        root.right.right.right.right = new Node(70);
        int h = findheight(root);
        System.out.println("Height of Binary tree is: " + h);
    }

    //TC:O(N) SC:O(h)
    private static int findheight(Node root) {
        if (root == null) return 0;
        return Math.max(findheight(root.left), findheight(root.right)) + 1;
    }
}
