package com.hashing;

import java.util.HashSet;

public class SubArrrayWithSum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, -1};
        int sum = 4;
        if (findsum(arr, sum)) {
            System.out.println("Given " + sum + " Exists");
        } else System.out.println("Not Exists");
    }

    //TC:O(N) SC:0(N)
    private static boolean findsum(int[] arr, int sum) {
        HashSet<Integer> st = new HashSet<>();
        int pref_sum = 0;
        for (int x : arr) {
            pref_sum += x;
            if (pref_sum == sum) return true;
            if (st.contains(pref_sum - sum)) return true;
            st.add(pref_sum);
        }
        return false;
    }
}
