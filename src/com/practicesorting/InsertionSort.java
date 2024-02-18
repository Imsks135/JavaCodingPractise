package com.practicesorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 2, 18};
        int n = arr.length;
        insertsort(arr, n);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    //worst case(Reverse sorted) TC:theta(n^2) inplace and stable used in practice for small arrays, Best case(Already sorted) TC: theta(n)
    //in general TC: O(n^2) SC: O(1)
    private static void insertsort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
