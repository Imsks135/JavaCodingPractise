package com.practisetree;

public class PostorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        postorderTraversal(root);
    }
    //TC:O(N) SC:O(h)
    private static void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.key + " ");
        }
    }
}
