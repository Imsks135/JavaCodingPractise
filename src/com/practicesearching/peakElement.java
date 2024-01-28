package com.practicesearching;

public class peakElement {
    public static void main(String[] args) {
        int[] arr = {5, 20, 10, 30, 20, 50, 60};
        int n = 7;
        System.out.println(findpeak(arr, n));
    }

    private static int findpeak(int[] arr, int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                    (mid == n - 1 || arr[mid + 1] <= arr[mid])) return arr[mid];
            if (arr[mid - 1] >= arr[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
