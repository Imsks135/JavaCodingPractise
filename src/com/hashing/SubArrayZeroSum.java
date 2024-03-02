package com.hashing;

import java.util.HashSet;

public class SubArrayZeroSum {
    public static void main(String[] args) {
        int[] arr = {-3, 4, 6, -1, 1};
        if (findsumzero(arr)) System.out.println("SubArray of Sum Zero Exists");
        else System.out.println("Not Exists");
    }

    //TC:O(N) SC:O(N)
    private static boolean findsumzero(int[] arr) {
        HashSet<Integer> st = new HashSet<>();
        int pref_sum = 0;
        for (int x : arr) {
            pref_sum += x;
            if (st.contains(pref_sum)) return true;
            if (pref_sum == 0) return true;
            st.add(pref_sum);
        }
        return false;
    }
}
