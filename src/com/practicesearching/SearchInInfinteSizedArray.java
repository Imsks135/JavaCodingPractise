package com.practicesearching;

import static com.practicesearching.BinarySearchRecursive.checkkbinary;

public class SearchInInfinteSizedArray {
    public static void main(String[] args) {
        int[] arr = {1, 10, 15, 20, 40, 60, 80, 100, 200, 400};
        int x = 100;
        System.out.println(searchininfintearray(arr, x));

    }

    private static int searchininfintearray(int[] arr, int x) {
        int i = 1;
        while (arr[i] < x) {
            i = i * 2;
        }
        if (arr[i] == x) return i;
        return checkkbinary(arr, i / 2 + 1, i - 1, x);
    }
}
