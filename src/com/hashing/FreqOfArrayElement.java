package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class FreqOfArrayElement {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 20, 20, 20, 30, 30, 40, 50};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(hm.size());
    }
}
