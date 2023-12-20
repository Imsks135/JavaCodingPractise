package com.practicedemo;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Input rotation count
        System.out.print("Enter the number of places to rotate the array by: ");
        int d = scanner.nextInt();
        // Rotate the array
        rotateArray(arr, d);
        // Display the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(arr));
        scanner.close();
    }

    private static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        // Ensure that d is within the range of array length
        d = d % n;

        // Create a temporary array to store the rotated elements
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy the rotated elements back to the original array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
