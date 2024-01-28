package com.practicesearching;

public class RepeatingElement1 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 3, 2, 2};
        int n = 6;
        System.out.println("The Repeating element is " + checkrepeat(arr, n));
    }

    // TC:O(n),SC:O(n)
    private static int checkrepeat(int[] arr, int n) {
        boolean[] visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visit[arr[i]]) return arr[i];
            visit[arr[i]] = true;
        }
        return -1;
    }
}
