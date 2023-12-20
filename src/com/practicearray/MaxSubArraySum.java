package com.practicearray;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int submax = maxSum(arr);
        System.out.println("Maximum subarray sum is " + submax);
    }

    private static int maxSum(int[] arr) {
        int res = arr[0];
        int maxending = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxending = Math.max(maxending + arr[i], arr[i]);
            res = Math.max(res, maxending);
        }
        return res;
    }
}
