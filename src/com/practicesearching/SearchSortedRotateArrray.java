package com.practicesearching;

public class SearchSortedRotateArrray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 60, 5, 8};
        int n = 6, x = 5;
        System.out.println(searchsortedrotatearray(arr, n, x));
    }

    //TC: O(log n),SC:O(1)
    private static int searchsortedrotatearray(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) return mid;
            if (arr[low] <= arr[mid]) {
                if (x >= arr[low] && x < arr[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if (x > arr[mid] && x <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
