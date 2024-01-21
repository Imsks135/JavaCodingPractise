package com.practicesearching;

public class LastOccurence {
    public static void main(String[] args) {

        int[] arr = {5, 10, 10, 10, 10, 20, 20};
        int n = 7, x = 10;
        System.out.println(lastocc(arr, n, x));
    }

    private static int lastocc(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) high = mid - 1;
            else if (arr[mid] < x) low = mid + 1;
            else {
                if (mid == n - 1 || arr[mid] != arr[mid + 1]) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }
}
