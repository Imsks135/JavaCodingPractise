package com.practiceBtree;

public class CeilInBST {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = 17;
        System.out.println("Ceil of " + x + " is " + (ceil(root, x).key));
    }

    //TC:O(h) SC:O(1)
    private static Node ceil(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key == x) return root;
            if (root.key < x) root = root.right;
            else {
                res = root;
                root = root.left;
            }
        }
        return res;
    }
}
