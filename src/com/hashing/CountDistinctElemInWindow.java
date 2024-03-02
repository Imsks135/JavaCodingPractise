package com.hashing;

import java.util.HashMap;

public class CountDistinctElemInWindow {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 30, 60, 40, 50};//NO.OF WINDOW= N-K+1
        int k = 4;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < k; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(mp.size());
        for (int i = k; i < arr.length; i++) {
            mp.put(arr[i - k], mp.get(arr[i - k]) - 1);
            if (mp.get(arr[i - k]) == 0) {
                mp.remove(arr[i - k]);
            }
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(mp.size());
    }
}
