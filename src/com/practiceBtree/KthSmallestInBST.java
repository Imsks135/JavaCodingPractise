package com.practiceBtree;

class Node1 {
    int data;
    Node1 left, right;
    int lCount;

    Node1(int x) {
        data = x;
        left = right = null;
        lCount = 0;
    }
}

public class KthSmallestInBST {
    public static void main(String[] args) {
        Node1 root = null;
        int[] keys = {20, 8, 22, 4, 12, 10, 14};
        for (int x : keys) {
            root = insert(root, x);
        }
        int k = 4;
        Node1 res = kthSmallest(root, k);
        if (res == null) System.out.println("Not Found");
        else System.out.println("Kth Smallest in BST is " + res.data);
    }

    private static Node1 kthSmallest(Node1 root, int k) {
        if (root == null) return null;
        int count = root.lCount + 1;
        if (count == k) return root;
        if (count > k) return kthSmallest(root.left, k);
        return kthSmallest(root.right, k - count);
    }

    private static Node1 insert(Node1 root, int x) {
        if (root == null) return new Node1(x);
        if (root.data > x) {
            root.left = insert(root.left, x);
            root.lCount++;
        } else if (root.data < x) {
            root.right = insert(root.right, x);
        }
        return root;
    }
}
