package com.practiceBtree;

import java.util.TreeSet;

public class CeilingLeftSideOfArr {
    public static void main(String[] args) {
        int[] arr = {2, 8, 30, 15, 25, 12};
        int n = arr.length;
        printCeiling(arr, n);
    }

    //TC: O(N*logN) SC: O(N)
    private static void printCeiling(int[] arr, int n) {
        System.out.print("-1" + " ");
        TreeSet<Integer> st = new TreeSet<>();
        st.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (st.ceiling(arr[i]) != null) System.out.print(st.ceiling(arr[i]) + " ");
            else System.out.print("-1" + " ");
            st.add(arr[i]);
        }
    }
}
