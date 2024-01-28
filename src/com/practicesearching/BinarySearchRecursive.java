package com.practicesearching;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which we want to search:");
        int x = sc.nextInt();
        System.out.println("Enter the number of elememts in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int y = checkkbinary(arr, 0, n - 1, x);
        if (y == -1) {
            System.out.println("Element not exists");
        } else {
            System.out.println("Element found at index:" + (y + 1));
        }
    }

    //TC:O(log n) , SC:O(log n)
    static int checkkbinary(int[] arr, int low, int high, int x) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == x) return mid;
        else if (arr[mid] > x) return checkkbinary(arr, low, mid - 1, x);
        else return checkkbinary(arr, mid + 1, high, x);
    }
}
