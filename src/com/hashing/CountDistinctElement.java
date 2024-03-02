package com.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 30, 40, 50};
        HashSet<Integer> hs = new HashSet<>();
        for (int j : arr) {
            hs.add(j);
        }
        System.out.println(hs);
        System.out.println(hs.size());
        Integer[] arr1 = {10, 10, 10, 20, 20, 30, 40, 40, 40, 50};
        HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(arr1));
        System.out.println(hs1);
        System.out.println(hs.size());
    }
}
