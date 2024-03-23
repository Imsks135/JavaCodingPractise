package com.practiceBtree;


public class InsertInBST {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        System.out.print("Before Insertion:");
        inorderTraversal(root);
        System.out.println();
        int val = 90;
        System.out.print("After Insertion:");
        Node new_root = insertInBST(root, val);
        inorderTraversal(new_root);
    }

    private static Node insertInBST(Node root, int val) {
        Node temp = new Node(val);
        Node Parent = null, curr = root;
        while (curr != null) {
            Parent = curr;
            if (curr.key > val) curr = curr.left;
            else if (curr.key < val) curr = curr.right;
            else return root;
        }
        if (Parent == null) return temp;
        if (Parent.key > val) Parent.left = temp;
        else Parent.right = temp;
        return root;
    }

    static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }
}
