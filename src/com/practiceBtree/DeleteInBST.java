package com.practiceBtree;

import static com.practiceBtree.InsertInBST.inorderTraversal;

public class DeleteInBST {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        int x = 60;
        System.out.print("Before deletion:");
        inorderTraversal(root);
        Node new_root = deleteInBST(root, x);
        System.out.println();
        System.out.print("After deletion:");
        inorderTraversal(new_root);
    }

    //TC: O(h) SC:O(h)
    private static Node deleteInBST(Node root, int x) {
        if (root == null) return null;
        if (root.key > x) root.left = deleteInBST(root.left, x);
        else if (root.key < x) root.right = deleteInBST(root.right, x);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                Node succ = getSucc(root);
                root.key = succ.key;
                root.right = deleteInBST(root.right, succ.key);
            }
        }
        return root;
    }

    private static Node getSucc(Node root) {
        Node curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}
