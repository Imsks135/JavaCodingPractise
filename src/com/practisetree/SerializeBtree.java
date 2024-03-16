package com.practisetree;

import java.util.ArrayList;

import static com.practisetree.InorderTraversal.inorderTraversal;

public class SerializeBtree {
    private static int EMPTY = -1;

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print("Before Serialization: ");
        inorderTraversal(root);
        System.out.println();
        ArrayList<Integer> arr = new ArrayList<>();
        serializeBTree(root, arr);
        System.out.print("After Serialization: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void serializeBTree(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            arr.add(EMPTY);
            return;
        }
        arr.add(root.key);
        serializeBTree(root.left, arr);
        serializeBTree(root.right, arr);
    }
}
