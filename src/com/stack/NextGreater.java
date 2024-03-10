package com.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 15, 10, 8, 6, 12, 9, 18};
        ArrayList<Integer> v = nextGreater(arr, arr.length);
        System.out.print("Next Greater Elements are: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> nextGreater(int[] arr, int n) {
        ArrayList<Integer> vt = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);
        vt.add(-1);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }
            int ng = st.isEmpty() ? -1 : st.peek();
            vt.add(ng);
            st.push(arr[i]);
        }
        Collections.reverse(vt);
        return vt;
    }
}

