package com.practicesearching;

public class FindPairSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 30};
        int x = 17;
        System.out.println(findpairsum(arr, x));
    }
    // for sorted array we'll be using single loop and constant space but
    // for unsorted we'll be using hashing which takes linear time and 0
    //TC:O(n),SC:O(1)
    private static boolean findpairsum(int[] arr, int x) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) return true;
            else if (arr[i] + arr[j] > x) j--;
            else i++;
        }
        return false;
    }
}
