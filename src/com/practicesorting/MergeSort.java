package com.practicesorting;

import static com.practicesorting.MergeFunction.mergefun;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 40, 8, 11, 15, 22, 25};
        int left = 0;
        int right = arr.length - 1;
        mergesort(arr, left, right);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    //TC: theta(NlogN) SC:theta(N)
    private static void mergesort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            mergefun(arr, left, mid, right);
        }
    }
}
