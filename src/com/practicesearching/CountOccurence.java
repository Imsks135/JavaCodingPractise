package com.practicesearching;

import static com.practicesearching.FirstOccurence.firstocc;
import static com.practicesearching.LastOccurence.lastocc;

public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 30, 40};
        int n = 6, x = 20;
        System.out.println(countocc(arr, n, x));
    }

    //TC:O(log n) ,SC:O(1)
    private static int countocc(int[] arr, int n, int x) {
        int first = firstocc(arr, n, x);
        if (first == -1) return 0;
        else return (lastocc(arr, n, x) - first + 1);
    }
}
