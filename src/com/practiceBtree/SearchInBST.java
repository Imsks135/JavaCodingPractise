package com.practiceBtree;

class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

public class SearchInBST {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        int val = 60;
        if (searchInBST(root, val)) {
            System.out.println("Given value " + val + " Present In BST");
        } else System.out.println("Given Value " + val + " Not Present In BST");
    }

    //TC:O(h) SC:O(1)
    private static boolean searchInBST(Node root, int val) {
        while (root != null) {
            if (root.key == val) return true;
            else if (root.key < val) root = root.right;
            else root = root.left;
        }
        return false;
    }
}
