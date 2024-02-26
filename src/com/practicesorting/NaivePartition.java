package com.practicesorting;

public class NaivePartition {
    public static void main(String[] args) {
        int[] arr = {5, 13, 6, 9, 12, 11, 8};
        int l = 0;
        int h = arr.length - 1;
        int p = 4;
        partition(arr, l, h, p);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // TC: O(n) and SC:O(n)
    private static void partition(int[] arr, int l, int h, int p) {
        int[] temp = new int[h - l + 1];
        int index = 0;
        for (int i = l; i <= h; i++) {
            if (arr[i] <= arr[p] && i != p) {
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[p];
        for (int i = l; i <= h; i++) {
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = l; i <= h; i++) {
            arr[i] = temp[i - l];
        }
    }
}
