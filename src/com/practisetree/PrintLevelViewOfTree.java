package com.practisetree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelViewOfTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        printleftViewTree(root);
    }
//TC:theta(N)   SC:theta(W) or O(N)
    private static void printleftViewTree(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (i == 0) System.out.print(curr.key + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
    }
}
