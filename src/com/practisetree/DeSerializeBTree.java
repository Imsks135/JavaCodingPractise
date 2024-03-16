package com.practisetree;

import java.util.ArrayList;
import java.util.Arrays;

import static com.practisetree.InorderTraversal.inorderTraversal;

public class DeSerializeBTree {
    private static final int EMPTY = -1;

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(
                Arrays.asList(1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1));
        Node root = deSerialize(arr);
        System.out.print("After Deserialization: ");
        inorderTraversal(root);
    }

    //TC :theta(N) SC:theta(N)
    static int index = 0;

    private static Node deSerialize(ArrayList<Integer> arr) {
        if (index == arr.size()) return null;
        int val = arr.get(index);
        index++;
        if (val == EMPTY) return null;
        Node temp = new Node(val);
        temp.left = deSerialize(arr);
        temp.right = deSerialize(arr);
        return temp;
    }
}
