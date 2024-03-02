package com.hashing;

import java.util.HashSet;

public class PairSumUnsortedArr {
    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 1, 2};
        int sum = 13;
        if (findpairsum(arr, sum)) System.out.println("Pair of " + sum + " Exists");
        else System.out.println("Not exits");
    }

    //TC:O(N) SC:O(N)
    private static boolean findpairsum(int[] arr, int sum) {
        HashSet<Integer> st = new HashSet<>();
        for (int x : arr) {
            if (st.contains(sum - x)) {
                return true;
            } else st.add(x);
        }
        return false;
    }
}
