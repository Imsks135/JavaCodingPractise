package com.stack;

import java.util.ArrayDeque;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = new int[]{60, 10, 20, 15, 35, 50};
        System.out.print("Array Elements are: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("Span of Array are: ");
        printSpan(arr, arr.length);
    }

    //TC:theta(N) SC:O(N)
    private static void printSpan(int[] arr, int n) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(0);
        System.out.print(1 + " ");
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            int span = st.isEmpty() ? i + 1 : i - st.peek();
            System.out.print(span + " ");
            st.push(i);
        }
    }
}
