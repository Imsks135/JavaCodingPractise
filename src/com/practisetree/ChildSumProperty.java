package com.practisetree;

public class ChildSumProperty {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.right.left = new Node(3);
        root.right.right = new Node(9);
        if (isChildSum(root)) System.out.println("Tree follows child sum property");
        else System.out.println("Tree doesnt follows child sum property");
    }

    //TC:O(N) SC:O(H)
    private static boolean isChildSum(Node root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        int sum = 0;
        if (root.left != null) sum += root.left.key;
        if (root.right != null) sum += root.right.key;
        return (sum == root.key && isChildSum(root.left) && isChildSum(root.right));

    }
}
