package com.practicesearching;

import java.util.Scanner;

public class BinarySearchIterative {
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
        int k = checkbinary(arr, x);
        if (k != -1) {
            System.out.println("Number exists at position " + (k + 1));
        } else {
            System.out.println("Number does not exist");
        }

    }

    //TC : O(log n)
    private static int checkbinary(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) return mid;
            else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
