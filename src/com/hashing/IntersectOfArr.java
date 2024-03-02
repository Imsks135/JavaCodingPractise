package com.hashing;

import java.util.HashSet;

public class IntersectOfArr {
    public static void main(String[] args) {
        int[] arr1 = {30, 20, 10, 50, 40};
        int[] arr2 = {30, 10, 25, 20, 15, 5};
        HashSet<Integer> st = new HashSet<Integer>();
        for (int j : arr1) {
            st.add(j);   //TC:theta(l1+l2) SC:theta(l2)
        }
        for (int j : arr2) {
            if (st.contains(j)) {
                System.out.print(j + " ");
            }
        }
    }
}
