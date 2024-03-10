package com.deque;

import java.util.Deque;
import java.util.LinkedList;

public class MaxInSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 8, 0, 10};
        int k = 3;
        printMaxInSubArray(arr, k);
    }

    private static void printMaxInSubArray(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (int i = k; i < n; i++) {
            System.out.print(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() < i - k) {
                dq.removeLast();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]);
    }
}
