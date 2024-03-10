package com.stack;

import java.util.ArrayDeque;

public class PrevGreater {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 30, 10, 5, 15};
        System.out.print("Previous greater elements are:");
        printPrevGrea(arr, arr.length);
    }

    //TC:O(N) SC:O(N)
    private static void printPrevGrea(int[] arr, int n) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(arr[0]);
        System.out.print(-1 + " ");
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            int prevGreat = st.isEmpty() ? -1 : st.peek();
            System.out.print(prevGreat + " ");
            st.push(arr[i]);
        }
    }
}
