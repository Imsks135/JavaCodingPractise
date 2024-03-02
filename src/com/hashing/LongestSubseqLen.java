package com.hashing;

import java.util.HashSet;

public class LongestSubseqLen {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 2, 4, 10, 8};
        int len = longestsubseqlen(arr);
        System.out.println("Largest SubSequence Length is " + len);
    }

    // TC:Theta(N) SC:O(N)
    private static int longestsubseqlen(int[] arr) {
        HashSet<Integer> st = new HashSet<>();
        for (int x : arr) {
            st.add(x);
        }
        int res = 1;
        for (Integer x : st) {
            if (!st.contains(x - 1)) {
                int curr = 1;
                while (st.contains(x + curr)) curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
