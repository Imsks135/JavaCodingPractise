package com.practicearray;

import java.util.Scanner;

public class RemoveDupSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = reduplicate(arr);
        for (int i = 0; i < temp; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //TC:O(n) SC:O(1)
    private static int reduplicate(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
