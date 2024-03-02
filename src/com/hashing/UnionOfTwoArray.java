package com.hashing;

import java.util.HashSet;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {30, 20, 10, 50, 40};
        int[] arr2 = {30, 10, 25, 20, 15, 5};
        HashSet<Integer> st = new HashSet<Integer>();
        for (int x : arr1) {
            st.add(x);  //TC:theta(l1+l2) and SC:O(l1+l2)
        }
        for (int x : arr2) {
            st.add(x);
        }
        System.out.println(st);
    }
}
