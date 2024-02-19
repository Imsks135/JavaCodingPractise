package com.practicesorting;

public class MergeFunction {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 40, 8, 11, 15, 22, 25};
        int low = 0;
        int high = arr.length - 1;
        int mid = 3;
        mergefun(arr, low, mid, high);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    //TC:theta(n) and SC:theta(n)
    static void mergefun(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + j + 1];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else arr[k++] = right[j++];
        }
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }
}
