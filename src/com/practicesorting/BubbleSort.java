package com.practicesorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 6};
        int n = arr.length;
        bubblesort(arr, n);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    // Worst case TC:O(n^2),SC:O(1) Stable and inplace sorting algorithms
    // Best case TC:O(n) single loop traversal if All elements are sorted
    private static void bubblesort(int[] arr, int n) {
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swapped = true;
            }
            if (!swapped) break;
        }
    }
}
