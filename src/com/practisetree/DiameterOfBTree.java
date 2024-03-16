package com.practisetree;

public class DiameterOfBTree {
    static int res = 0;

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        int diam = heightOfBtree(root);
        System.out.println("Height of Binary Tree is:" + diam);
        System.out.println("Diameter of Binary Tree is:" + res);
    }

    //TC:O(N)   SC:O(H)
    private static int heightOfBtree(Node root) {
        if (root == null) return 0;
        int lh = heightOfBtree(root.left);
        int rh = heightOfBtree(root.right);
        res = Math.max(res, 1 + lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
