package com.practicesearching;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 15, 25};
        int x = 32;
        if (checktriplet(arr, x)) {
            System.out.println("Triplet of " + x + " exists");
        } else {
            System.out.println("Triplet Not Exists");
        }
    }

    //TC: O(n), SC:O(1)
    private static boolean checktriplet(int[] arr, int x) {
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                if (currentSum == x) {
                    return true;
                } else if (currentSum < x) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
}
