package com.hashing;

import java.util.HashMap;

public class LongestSubarrayGivenSum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, -1};
        int sum = 5;
        int len = finflargestsubarr(arr, sum);
        System.out.println("Largest Subarray of Sum " + sum + " is " + len);
    }

    //TC:O(N) SC:O(N)
    private static int finflargestsubarr(int[] arr, int sum) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int pref_sum = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            pref_sum += arr[i];
            if (pref_sum == sum) res = i + 1;
            if (!mp.containsKey(pref_sum)) mp.put(pref_sum, i);
            if (mp.containsKey(pref_sum - sum)) {
                res = Math.max(res, i - mp.get(pref_sum - sum));
            }
        }
        return res;
    }
}
