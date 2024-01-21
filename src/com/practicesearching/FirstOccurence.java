package com.practicesearching;

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 20};
        int n = 6, x = 10;
        System.out.println(firstocc(arr, n, x));
    }

    private static int firstocc(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid] != arr[mid - 1]) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
