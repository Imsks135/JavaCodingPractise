package com.practisetree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrderLineByLine2 {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        printLevelLineByLine2(root);
    }

    //TC:O(N) SC:theta(W) or O(N)
    private static void printLevelLineByLine2(Node root) {
        if (root == null) ;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int currsize = q.size();
            for (int i = 0; i < currsize; i++) {
                Node curr = q.poll();
                System.out.print(curr.key + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            System.out.println();
        }

    }
}
