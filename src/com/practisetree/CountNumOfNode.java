package com.practisetree;

public class CountNumOfNode {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int countNode = countNoNode(root);
        System.out.println("Number Of Nodes In a Tree: " + countNode);
    }

    //TC: theta(N)
    private static int countNoNode(Node root) {
        if (root == null) return 0;
        else return 1 + countNoNode(root.left) + countNoNode(root.right);
    }
}
